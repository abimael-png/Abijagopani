public class Main {
public static void main(String[] args) {

int hari = 3;  

    switch (hari) {  
        case 1:  
            System.out.println("senin");  
            break;  
        case 2:  
            System.out.println("selasa");  
            break;  
        case 3:  
            System.out.println("rabu");  
            break;  
        default:  
            System.out.println("1-3 ji");  
            break;  
    }  

      
    for (int i = 1; i <= 5; i++) {  
        if (i == 3) {  
            continue;  
        }  

        System.out.println(i);  
    }  

    int angka = 5;  

    while (true) {  
        System.out.println("angka: " + angka);  
        angka--;  

        if (angka == 0) {  
            System.out.println("selesai.");  
            return;  
        }  
    }  
}

          }
