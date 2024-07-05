public class LombokTest {
    public static void main(String[] args) {
        // test constructor
        UserLombokModel lombokModel = new UserLombokModel(100, "Ramesh", "Fadatare", 28, "Male");
        System.out.println(lombokModel.toString());

        UserLombokModel lombokMdl = new UserLombokModel();

        User trad = new User();

        int id=9999;
        UserLomBokReqArgs ra = new UserLomBokReqArgs(id);
        System.out.println("Req Arg="+ra.toString());

        // test getter and setter methods
        lombokMdl.setId(100);
        lombokMdl.setFirstName("Ramesh");
        lombokMdl.setLastName("Fadatare");
        lombokMdl.setAge(28);
        lombokMdl.setGender("Male");

        System.out.println(lombokMdl.getId());
        System.out.println(lombokMdl.getFirstName());
        System.out.println(lombokMdl.getLastName());
        System.out.println(lombokMdl.getGender());
        System.out.println(lombokMdl.getAge());

        System.out.println(lombokMdl.toString());

    }
}