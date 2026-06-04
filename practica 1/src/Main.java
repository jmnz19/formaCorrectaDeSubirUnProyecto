


import javax.swing.JOptionPane;

public class Main {

public static void main(String[] args) {

String nombre, apellido;

double salario;
double sem, ivm, impuesto;
double totalPagar;

nombre = JOptionPane.showInputDialog("Digite su nombre");
apellido = JOptionPane.showInputDialog("Digite su apellido");

salario = Double.parseDouble(
JOptionPane.showInputDialog("Digite el salario"));

// Cálculo SEM
sem = salario * 0.0925;

// Cálculo IVM
ivm = salario * 0.0508;

// Impuesto
if (salario < 922000) {

impuesto = 0;

} else if (salario <= 1352000) {

impuesto = (salario - 922000) * 0.10;

} else {

impuesto = (salario - 1352000) * 0.15;

}

// Total rebajos
totalPagar = salario - sem - ivm - impuesto;

JOptionPane.showMessageDialog(null,
"Nombre: " + nombre +
"\nApellido: " + apellido +
"\nSEM: ₡" + sem +
"\nIVM: ₡" + ivm +
"\nImpuesto: ₡" + impuesto +
"\nMonto total a pagar: ₡" + totalPagar);
}
}
