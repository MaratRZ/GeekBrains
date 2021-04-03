package com.company.homework_01_08.core;

import com.company.homework_01_08.core.domain.MatrixCoordinate;
import com.company.homework_01_08.enums.DotType;

public interface GameService {

    MatrixCoordinate aiTurn();

    void humanTurn(int rowIndex, int columnIndex);

    boolean checkWin(DotType dotType);

    boolean isMapFull();

}
