import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Responder {
    private HashMap<String, ArrayList<String>> responses;
    private ArrayList<String> defaultResponses;
    private Random randomGenerator;

    public Responder() {
        responses = new HashMap<>();
        defaultResponses = new ArrayList<>();
        randomGenerator = new Random();
        fillResponses();
    }

    public String generateResponse(String input) {
        String response = null;

        for (String keyword : responses.keySet()) {
            if (input.contains(keyword)) {
                ArrayList<String> possibleResponses = responses.get(keyword);
                response = possibleResponses.get(
                        randomGenerator.nextInt(possibleResponses.size()));
                break;
            }
        }

        if (response == null) {
            response = defaultResponses.get(
                    randomGenerator.nextInt(defaultResponses.size()));
        }

        return response;
    }

    private void fillResponses() {
        addResponse("login", "Pastikan username dan password Anda benar.");
        addResponse("login", "Coba reset password jika lupa.");

        addResponse("frs", "Pastikan masa pengisian FRS masih dibuka.");
        addResponse("frs", "Cek apakah Anda sudah memenuhi prasyarat mata kuliah.");

        addResponse("error", "Silakan coba logout dan login kembali.");
        addResponse("error", "Hubungi admin akademik jika masalah berlanjut.");

        addResponse("matkul", "Pastikan kuota mata kuliah masih tersedia.");
        addResponse("matkul", "Cek jadwal agar tidak bentrok.");

        defaultResponses.add("Bisa jelaskan masalah Anda lebih detail?");
        defaultResponses.add("Silakan coba ulangi kembali.");
        defaultResponses.add("Terima kasih atas laporannya.");
        defaultResponses.add("Mohon tunggu, sistem sedang diproses.");
    }

    private void addResponse(String keyword, String response) {
        responses.putIfAbsent(keyword, new ArrayList<>());
        responses.get(keyword).add(response);
    }
}
