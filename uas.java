import java.util.Scanner;

class tabungan {
    private int token;
    private double saldo;

    public tabungan() {
        saldo = 0;
    }

    public double getSaldo(){
        return saldo;
    }
    public void setToken(int Token){
        this.token = Token;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public void tambahSaldo(double jumlah) {
        saldo += jumlah;
        System.out.println("Token "+token+"\nSaldo bertambah sebesar "+jumlah+" \nSaldo sekarang : "+saldo);
    }
    public void tarikSaldo(double jumlah){
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("Token "+token+"\nSelamat Berhasil menarik saldo sebesar "+jumlah+" \nSaldo sekarang : "+saldo);
        } else {
            System.out.println("Maaf Saldo tidak Mencukupi. Saldo sekarang : "+saldo);
        }
    }

}

public class uas {
    public static void main(String[] args) {
        tabungan tb = new tabungan();
        Scanner input = new Scanner(System.in);
        boolean selesai = false;
        System.out.print("ATM Tanpa Kartu \nMasukan Kode Token :");
        int tokenAnda = input.nextInt();
        tb.setToken(tokenAnda);
        while(!selesai){
            System.out.println("Mau Setor atau tarik? \n1.Setor \n2. Tarik \n0.Batal \n------------- \nPilihan anda :");
            int pilih = input.nextInt();
            switch (pilih) {
                case 0 :
                    selesai = true;
                    break;
                case 1:
                    System.out.println("Masukkan Saldo yang anda tambahkan : ");
                    double tambahkan = input.nextDouble();
                    tb.tambahSaldo(tambahkan);
                    break;
                case 2:
                    System.out.println("Masukan saldo yang anda tarik : : ");
                    double tarik = input.nextDouble();
                    tb.tarikSaldo(tarik);
                    break;
                default:
                System.out.println("Maaf bukan termasuk menu");

        }
        }
        input.close();
    }
}