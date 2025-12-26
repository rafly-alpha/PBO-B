/**
 * The Comment class stores a single customer comment.
 * It includes author, text, rating, and vote balance.
 */
public class Comment
{
    private String author;
    private String text;
    private int rating;
    private int voteBalance;

    /**
     * Create a new comment.
     */
    public Comment(String author, String text, int rating)
    {
        this.author = author;
        this.text = text;
        this.rating = rating;
        voteBalance = 0;
    }

    public String getAuthor()
    {
        return author;
    }

    public int getRating()
    {
        return rating;
    }

    public int getVoteCount()
    {
        return voteBalance;
    }

    public void upvote()
    {
        voteBalance++;
    }

    public void downvote()
    {
        voteBalance--;
    }

    public String getFullDetails()
    {
        return "Author: " + author +
               "\nRating: " + rating +
               "\nVotes: " + voteBalance +
               "\nComment: " + text;
    }
}
