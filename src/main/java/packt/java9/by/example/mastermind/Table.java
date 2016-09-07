package packt.java9.by.example.mastermind;

import java.util.LinkedList;
import java.util.List;

/**
 * Represents the state of the table of the game.
 */
public class Table {
    final ColorManager manager;
    final int nrColumns;
    final List<Row> rows;

    public Table(int nrColumns, ColorManager manager) {
        this.nrColumns = nrColumns;
        this.rows = new LinkedList<>();
        this.manager = manager;
    }

    public int nrOfColumns() {
        return nrColumns;
    }

    public void addRow(Row row) {
        rows.add(row);
    }
}
