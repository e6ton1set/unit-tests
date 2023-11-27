package seminar2.vehicle;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car("Toyota", "Camry", 2023);
    }

    @AfterEach
    void tearDown() {
        car = null;
    }

    @Test
    @DisplayName("Проверить, что экземпляр объекта Car также является экземпляром транспортного средства")
    void checkTypeCar(){
        assertEquals(true, car instanceof Vehicle);
    }

    @Test
    @DisplayName("Проверить, что объект Car создается с 4-мя колесами")
    void checkNumWheelsCar(){
        assertEquals(4, car.getNumWheels());
    }

    @Test
    @DisplayName("Проверить, что объект Car развивает скорость 60 в режиме тестового вождения")
    void checkSpeedCarInModeTestDrive(){
        car.testDrive();
        assertEquals(59.1, car.getSpeed(), .99);
    }

    @Test
    @DisplayName("Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0)")
    void checkAfterTestDriveSpeedEqualsSpeedPark(){
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed(), .01);
    }
}