/*
 * Ad Soyad: [Hüseyin Enes Demir]
 * Ogrenci No: [250541047]
 * Tarih: [13.11.2025]
 * Aciklama: Gorev 2 - Fizik Formulu Asistani
 *
 * Bu program temel fizik formullerini kullanarak
 * hesaplamalar yapar.
 */

import java.util.Scanner;

public class FizikFormul {

    // Sabit: Yercekimi ivmesi
    final static double GRAVITY = 9.8; // m/s²

    // METOT 1: Hız hesapla (v = s / t)
    public static double calculateVelocity(double distance, double time) {
        // v = mesafe / zaman
        double velocity=distance/time;
        return velocity; // Degistirin
    }

    // METOT 2: İvme hesapla (a = Δv / t)
    public static double calculateAcceleration(double velocityChange, double time) {
        // a = hiz degisimi / zaman
        double acceleration=velocityChange/time;
        return acceleration; // Degistirin
    }

    // METOT 3: Kuvvet hesapla (F = m * a)
    public static double calculateForce(double mass, double acceleration) {
        // F = kutle * ivme
        double force=mass*acceleration;
        return force; // Degistirin
    }

    // METOT 4: İş hesapla (W = F * d)
    public static double calculateWork(double force, double distance) {
        // W = kuvvet * mesafe
        double work=force*distance;
        return work; // Degistirin
    }

    // METOT 5: Güç hesapla (P = W / t)
    public static double calculatePower(double work, double time) {
        // P = is / zaman
       double  power=work/time;
        return power; // Degistirin
    }

    // METOT 6: Kinetik enerji (KE = 0.5 * m * v²)
    public static double calculateKineticEnergy(double mass, double velocity) {
        // KE = 0.5 * kutle * (hiz * hiz)
        // Math.pow(velocity, 2) kullanabilirsiniz
        double kinetik=0.5;
        double kineticEnergy=kinetik*mass*velocity*velocity;
        return kineticEnergy; // Degistirin
    }

    // METOT 7: Potansiyel enerji (PE = m * g * h)
    public static double calculatePotentialEnergy(double mass, double gravity, double height) {
        // PE = kutle * yercekimi * yukseklik
        double  potentialEnergy = mass*gravity*height;
        return potentialEnergy; // Degistirin
    }

    // METOT 8: Momentum (p = m * v)
    public static double calculateMomentum(double mass, double velocity) {
        // p = kutle * hiz
        double momentum=mass*velocity;
        return momentum; // Degistirin
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== FIZIK FORMUL ASISTANI ===");
        System.out.println();

        // TEMEL OLCUMLER
        System.out.println("TEMEL OLCUMLER:");
        System.out.print("Kutle (kg): ");
        double mass = input.nextDouble();

        System.out.print("Mesafe (m): ");
        double distance = input.nextDouble();

        System.out.print("Zaman (s): ");
        double time = input.nextDouble();

        System.out.print("Hiz degisimi (m/s): ");
        double deltaV = input.nextDouble();

        System.out.print("Yukseklik (m): ");
        double height = input.nextDouble();

        // HESAPLAMALARI YAP - Metotlari cagir
        // 1. Hiz (v) hesaplanmali (KE ve Momentum icin gerekli)
        // 2. Ivme (a) hesaplanmali (Kuvvet icin gerekli)
        // 3. Kuvvet (F) hesaplanmali (Is icin gerekli)
        // 4. Is (W) hesaplanmali (Guc icin gerekli)
        // ... digerlerini hesaplayin
  


        // SONUCLARI YAZDIR
        System.out.println("\n========================================");
        System.out.println("        HESAPLAMA SONUCLARI");
        System.out.println("========================================");

        System.out.println("\nHIZ ve HAREKET:");
        System.out.printf("  Hiz (v = s/t)             : %.2f m/s\n", calculateVelocity(mass,distance));
        System.out.printf("  Ivme (a = Δv/t)           : %.2f m/s²\n", calculateAcceleration(deltaV,time));

        System.out.println("\nKUVVET ve IS:");
        System.out.printf("  Kuvvet (F = m*a)          : %.2f N\n", calculateForce(mass,deltaV));
        System.out.printf("  Is (W = F*d)              : %.2f J\n", calculateWork(calculateForce(mass,deltaV),distance));
        System.out.printf("  Guc (P = W/t)             : %.2f W\n", calculatePower(calculateWork(calculateForce(mass,deltaV),distance), time)));

        System.out.println("\nENERJI:");
        System.out.printf("  Kinetik Enerji (KE)       : %.2f J\n", calculateKineticEnergy(mass, Math.pow(velocity, 2)));
        System.out.printf("  Potansiyel Enerji (PE)    : %.2f J\n", calculatePotentialEnergy(mass,GRAVITY,height));
        // Toplam enerji = KE + PE
        System.out.printf("  Toplam Enerji             : %.2f J\n", (kineticEnergy + potentialEnergy)); 

        System.out.println("\nMOMENTUM:");
        System.out.printf("  Momentum (p = m*v)        : %.2f kg·m/s\n", calculateMomentum(mass,calculateVelocity(mass,distance)));

        System.out.println("\n========================================");

        input.close();
    }
}
