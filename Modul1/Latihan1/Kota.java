public class Kota<E> {
    private E element;

    public Kota(E Kota){
        element = Kota;
    }

    public E getElement(){
        return element;
    }

    public static void main(String[] args){
        Kota<Integer> jumlahkota = new Kota<Integer>(9);
        Kota<String> namakota = new Kota<String>("Malang");
        System.out.println("Jumlah Kota di Jawa timur : "+ jumlahkota.getElement() + " Kota ");
        System.out.println("Salah Satu Kota di jawa timur : "+ namakota.getElement());
    }
}
