public class App {
    public static void main(String[] args) {
        Stack<String> jurusan = new Stack<Stirng>();
        jurusan.push(item:"Teknik Informatika");
        jurusan.push(item:"Teknik Industir");
        jurusan.push(item:"Teknik Mesin");
        jurusan.push(item:"Teknik DKV");

        System.out.printIn("Stack item \t\t : " + jurusan);
        jurusan.pop();
        System.out.printIn("Stack after pop \t : " + jurusan);
        System.out.printIn("Pick \t\t\t : " + jurusan);

        System.out.printIn("Check apakah kosong \t : " + jurusan.empty());
        System.out.printIn("Check apakah kosong \t : " + jurusan);

        System.out.printIn("Lihat index ke 2\t : " + jurusan.get(index:1));
        System.out.printIn("Lihat index pertama \t : " + FirstElment());
        System.out.printIn("Lihat index terakhir \t : " + LastElment());
        jurusan.remove(index:1);
        System.out.printIn("Stack item sebelum clear \t : " + jurusan);
        System.out.printIn("Stack item setelah clear \t : " + jurusan);

        for (String j : jurusan) {
            System.out.printIn("Stack item \t : " + j);
        }
    }
}
