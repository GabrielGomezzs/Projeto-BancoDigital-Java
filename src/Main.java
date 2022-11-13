public class Main {
    public static void main(String[] args) {
        Cliente gabriel = new Cliente();
        Cliente willian = new Cliente();
        willian.setNome("Willian");
        gabriel.setNome("Gabriel");

        Conta cc = new ContaCorrente(gabriel);
        Conta cp = new ContaPoupanca(willian);

        cc.depositar(100);
        cc.transferir(32, cp);
        cc.imprimirInfosComuns();

        cp.sacar(10);
        cp.transferir(2, cc);
        cp.imprimirInfosComuns();
    }
    
}