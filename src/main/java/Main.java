public class Main {

    public static void main(String[] args) {

        Post post = new Post();

        post.name = "Евгений";
        post.passport = "4444 № 444444";
        post.patronymic = "Олегович";
        post.phone = "+7(999) 999-99-99";
        post.surname = "Смирнов";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 12;
        post.birthday.year = 1999;

    }

}
