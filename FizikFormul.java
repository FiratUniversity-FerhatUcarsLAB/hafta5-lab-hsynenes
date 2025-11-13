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
        double velocity = distance / time;
        return velocity; // Duzeltildi
    }

    // METOT 2: İvme hesapla (a = Δv / t)
    public static double calculateAcceleration(double velocityChange, double time) {
        // a = hiz degisimi / zaman
        double acceleration = velocityChange / time;
        return acceleration; // Duzeltildi
    }

    // METOT 3: Kuvvet hesapla (F = m * a)
    public static double calculateForce(double mass, double acceleration) {
        // F = kutle * ivme
        double force = mass * acceleration;
        return force; // Duzeltildi
    }

    // METOT 4: İş hesapla (W = F * d)
    public static double calculateWork(double force, double distance) {
        // W = kuvvet * mesafe
        double work = force * distance;
        return work; // Duzeltildi
    }

    // METOT 5: Güç hesapla (P = W / t)
    public static double calculatePower(double work, double time) {
        // P = is / zaman
        double power = work / time;
        return power; // Duzeltildi
    }

    // METOT 6: Kinetik enerji (KE = 0.5 * m * v²)
    public static double calculateKineticEnergy(double mass, double velocity) {
        // KE = 0.5 * kutle * (hiz * hiz)
        // Math.pow(velocity, 2) kullanabilirsiniz
        // Duzeltildi: Gerekli Math.pow kullanimi kaldırıldı, basit carpma yapildi.
        double kineticEnergy = 0.5 * mass * velocity * velocity;
        return kineticEnergy; // Duzeltildi
    }

    // METOT 7: Potansiyel enerji (PE = m * g * h)
    public static double calculatePotentialEnergy(double mass, double gravity, double height) {
        // PE = kutle * yercekimi * yukseklik
        double potentialEnergy = mass * gravity * height;
        return potentialEnergy; // Duzeltildi
    }

    // METOT 8: Momentum (p = m * v)
    public static double calculateMomentum(double mass, double velocity) {
        // p = kutle * hiz
        double momentum = mass * velocity;
        return momentum; // Duzeltildi
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

        // HESAPLAMALARI YAP - Metotlari cagir (Mantık hatası düzeltildi: Sonuçlar
        // değişkene atandı)

        // 1. Hiz (v) hesaplanmali (KE ve Momentum icin gerekli)
        double velocity = calculateVelocity(distance, time);

        // 2. Ivme (a) hesaplanmali (Kuvvet icin gerekli)
        double acceleration = calculateAcceleration(deltaV, time);

        // 3. Kuvvet (F) hesaplanmali (Is icin gerekli)
        // Kuvvet hesaplamasında doğru parametre olarak 'acceleration' kullanılmalıydı.
        double force = calculateForce(mass, acceleration);

        // 4. Is (W) hesaplanmali (Guc icin gerekli)
        double work = calculateWork(force, distance);

        // 5. Guc (P) hesaplanmali
        double power = calculatePower(work, time);

        // 6. Kinetik Enerji (KE) hesaplanmali
        double kineticEnergy = calculateKineticEnergy(mass, velocity);

        // 7. Potansiyel Enerji (PE) hesaplanmali
        double potentialEnergy = calculatePotentialEnergy(mass, GRAVITY, height);

        // 8. Momentum (p) hesaplanmali
        double momentum = calculateMomentum(mass, velocity);

        // SONUCLARI YAZDIR (Çıktı formatı ve değişken isimleri düzeltildi)
        System.out.println("\n========================================");
        System.out.println("         HESAPLAMA SONUCLARI");
        System.out.println("========================================");

        System.out.println("\nHIZ ve HAREKET:");
        // calculateVelocity(mass,distance) -> calculateVelocity(distance,time)
        // kullanılmalıydı
        System.out.printf("  Hiz (v = s/t)             : %.2f m/s\n", velocity);
        System.out.printf("  Ivme (a = Δv/t)           : %.2f m/s²\n", acceleration);

        System.out.println("\nKUVVET ve IS:");
        // Kuvvet hesaplaması için doğru değişkenler kullanılmalıydı.
        System.out.printf("  Kuvvet (F = m*a)          : %.2f N\n", force);
        System.out.printf("  Is (W = F*d)              : %.2f J\n", work);
        System.out.printf("  Guc (P = W/t)             : %.2f W\n", power);

        System.out.println("\nENERJI:");
        // Kinetik Enerji hesaplaması için Math.pow kullanılmış ve velocity değişkeni
        // yanlış çağrılmış.
        // Doğrusu: calculateKineticEnergy(mass, velocity)
        System.out.printf("  Kinetik Enerji (KE)       : %.2f J\n", kineticEnergy);
        System.out.printf("  Potansiyel Enerji (PE)    : %.2f J\n", potentialEnergy);
        // Toplam enerji = KE + PE
        System.out.printf("  Toplam Enerji             : %.2f J\n", (kineticEnergy + potentialEnergy));

        System.out.println("\nMOMENTUM:");
        // calculateMomentum(mass,calculateVelocity(mass,distance)) yerine atanmış
        // değişken kullanılmalı.
        System.out.printf("  Momentum (p = m*v)        : %.2f kg·m/s\n", momentum);

        System.out.println("\n========================================");

        input.close();
    }
}
