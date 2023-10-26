package Day_25_Methods;

public class Email {
    public static void main(String[] args) {
        String fullName = "Sevil Kurtbedinov";
        String domain = "gMail";
        createEmail(fullName, domain);
        createEmail("Diliara Temirkaiaieva", "yandex");
    }
    public static void createEmail (String fullName, String domain) {
        String email = fullName.charAt(0) + "" + fullName.substring(fullName.indexOf(" ")).trim() + "@" + domain.toLowerCase() + ".com";
        System.out.println(email.toLowerCase());
    }
}
