package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        //pytanie do tego zadania:
        //czy powinienem wywolywac metode overlock jako processor.overclock() czy jako computer.processor.overclock()
        //czemu obie formy dzialaja ?
        Processor processor = new Processor("i9", "intel", "7300k", 3000);
        Memory memory = new Memory("King", "Asus", "17300", 2, 3000);
        HardDrive hardDrive = new HardDrive("Super", "Samsung", "8330", 128);
        Computer computer = new Computer(processor, memory, hardDrive);
        processor.overlock();
        computer.processor.overlock();
        processor.overlock();
        processor.overlock();
        processor.overlock();
        processor.overlock();
        processor.overlock();
        processor.overlock();
        memory.overlock();
        memory.overlock();
        memory.overlock();
        memory.overlock();

    }
}
