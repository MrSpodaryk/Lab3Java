package Writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

import ua.lviv.iot.dish.models.Dish;

public class DishWriter {

    public DishWriter() {
    }

    public final void writeToFile(List<Dish> dishes) throws IOException {

        File myFile = new File("my_dishes");

        try (FileOutputStream fos = new FileOutputStream(myFile); // відкриває потік
                OutputStreamWriter osw = new OutputStreamWriter(fos); // трансформує текст вбайти
                BufferedWriter bufWriter = new BufferedWriter(osw);) { // буферизує текст

            for (int index = 0; index < dishes.size(); index++) {
                bufWriter.write(dishes.get(index).toString());
                bufWriter.newLine();
            }

        } finally {

        }
    }
}
