package algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TinkerTailor {
    public static final int arrayShift = 1;

    public List getWinner(int size, int k) {
        List board = createGameBoard(size);
        List byExpectedOrder = new ArrayList();
        int index = 0;

        while (!board.isEmpty()) {
            index = (index + k - 1) % board.size();

            Object retrievedValue = board.get(index);
            byExpectedOrder.add(retrievedValue);
            board.remove(index);
        }

        return byExpectedOrder;
    }

    private List createGameBoard(int size) {
        return IntStream.rangeClosed(1, size)
                        .boxed()
                        .collect(Collectors.toCollection(LinkedList::new));
    }

    public static void main(String[] args) {
        TinkerTailor tinkerTailor = new TinkerTailor();

        System.out.println(tinkerTailor.getWinner(5, 3));
    }
}
