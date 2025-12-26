import java.util.ArrayList;
import java.util.Iterator;

/**
 * SalesItem represents a product in an online shop.
 * It stores product data and customer comments.
 */
public class SalesItem
{
    private String name;
    private int price; // in cents
    private ArrayList<Comment> comments;

    /**
     * Create a new sales item.
     */
    public SalesItem(String name, int price)
    {
        this.name = name;
        this.price = price;
        comments = new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }

    public int getPrice()
    {
        return price;
    }

    public int getNumberOfComments()
    {
        return comments.size();
    }

    /**
     * Add a comment if rating valid and author not duplicated.
     */
    public boolean addComment(String author, String text, int rating)
    {
        if (ratingInvalid(rating)) {
            return false;
        }
        if (findCommentByAuthor(author) != null) {
            return false;
        }
        comments.add(new Comment(author, text, rating));
        return true;
    }

    public void removeComment(int index)
    {
        if (index >= 0 && index < comments.size()) {
            comments.remove(index);
        }
    }

    public void upvoteComment(int index)
    {
        if (index >= 0 && index < comments.size()) {
            comments.get(index).upvote();
        }
    }

    public void downvoteComment(int index)
    {
        if (index >= 0 && index < comments.size()) {
            comments.get(index).downvote();
        }
    }

    public void showInfo()
    {
        System.out.println("*** " + name + " ***");
        System.out.println("Price: " + priceString(price));
        System.out.println("\nCustomer comments:");
        for (Comment c : comments) {
            System.out.println("--------------------------------");
            System.out.println(c.getFullDetails());
        }
        System.out.println("================================");
    }

    public Comment findMostHelpfulComment()
    {
        if (comments.isEmpty()) {
            return null;
        }

        Iterator<Comment> it = comments.iterator();
        Comment best = it.next();

        while (it.hasNext()) {
            Comment current = it.next();
            if (current.getVoteCount() > best.getVoteCount()) {
                best = current;
            }
        }
        return best;
    }

    private boolean ratingInvalid(int rating)
    {
        return rating < 1 || rating > 5;
    }

    private Comment findCommentByAuthor(String author)
    {
        for (Comment c : comments) {
            if (c.getAuthor().equals(author)) {
                return c;
            }
        }
        return null;
    }

    private String priceString(int price)
    {
        int dollars = price / 100;
        int cents = price - (dollars * 100);

        if (cents <= 9) {
            return "$" + dollars + ".0" + cents;
        }
        return "$" + dollars + "." + cents;
    }
}
