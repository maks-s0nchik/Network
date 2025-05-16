public class Laba7_3 {
    public static void main(String[] args) {
        // Створюємо масив із різних літаків
        Aircraft[] fleet = new Aircraft[4];

        // Два пасажирські літаки
        fleet[0] = new PassengerPlane(150, 1200);   
        fleet[1] = new PassengerPlane(200, 950);    

        // Два вантажні літаки
        fleet[2] = new CargoPlane(18, 3000);        
        fleet[3] = new CargoPlane(25, 2800);        

        double totalRevenue = 0;
        for (Aircraft aircraft : fleet) {
            double revenue = aircraft.calculateRevenue();
            System.out.println(aircraft.getInfo() + " — Дохід: " + revenue + " грн");
            totalRevenue += revenue;
        }

        System.out.println("\nЗагальний дохід від усіх рейсів: " + totalRevenue + " грн");
    }
}

// Абстрактний батьківський клас
abstract class Aircraft {
    public abstract double calculateRevenue();

    public abstract String getInfo();
}

// Дочірній клас — пасажирський літак
class PassengerPlane extends Aircraft {
    private int passengers;
    private double ticketPrice;

    public PassengerPlane(int passengers, double ticketPrice) {
        this.passengers = passengers;
        this.ticketPrice = ticketPrice;
    }

    @Override
    public double calculateRevenue() {
        return passengers * ticketPrice;
    }

    @Override
    public String getInfo() {
        return "Пасажирський літак (" + passengers + " пасажирів, " + ticketPrice + " грн/квиток)";
    }
}

// Дочірній клас — вантажний літак
class CargoPlane extends Aircraft {
    private double tonnage;
    private double ratePerTon;

    public CargoPlane(double tonnage, double ratePerTon) {
        this.tonnage = tonnage;
        this.ratePerTon = ratePerTon;
    }

    @Override
    public double calculateRevenue() {
        return tonnage * ratePerTon;
    }

    @Override
    public String getInfo() {
        return "Вантажний літак (" + tonnage + " т, " + ratePerTon + " грн/т)";
    }
}