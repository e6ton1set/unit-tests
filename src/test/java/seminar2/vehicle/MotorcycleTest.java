package seminar2.vehicle;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MotorcycleTest {

    private Motorcycle motorcycle;

    @BeforeEach
    void setUp() {
        motorcycle = new Motorcycle("Bike", "Batman", 2175);
    }

    @AfterEach
    void tearDown() {
        motorcycle = null;
    }

    @Test
    @DisplayName("Проверить, что объект Motorcycle создается с 2-мя колесами")
    void checkNumWheelsCar(){
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    @DisplayName("Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения")
    void checkSpeedCarInModeTestDrive(){
        motorcycle.testDrive();
        assertEquals(74.4, motorcycle.getSpeed(), .99);
    }

    @Test
    @DisplayName("Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0)")
    void checkAfterTestDriveSpeedEqualsSpeedPark(){
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed(), .01);
    }
}