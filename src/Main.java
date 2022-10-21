public class Main {
    public static void main(String[] args){
        // membuat object
        Person person1 = new Person();
        Person person2 = new Person();

        /* memanggil atribut dan memberi nilai */
        person1.Nama = "Riko";
        person1.jenisKelamin = "Laki-laki";
        person1.Umur = 23;

        System.out.println("Data person 1 : ");
        System.out.println("Nama: " + person1.Nama);
        System.out.println("Jenis Kelamin: " + person1.jenisKelamin);
        System.out.println("Umur: " + person1.Umur);
        System.out.println(" ");

        person2.Nama = "Anton";
        person2.jenisKelamin = "Laki-laki";
        person2.Umur = 22;

        System.out.println("Data person 2 : ");
        System.out.println("Nama: " + person2.Nama);
        System.out.println("Jenis Kelamin: " + person2.jenisKelamin);
        System.out.println("Umur: " + person2.Umur);

    }
}
