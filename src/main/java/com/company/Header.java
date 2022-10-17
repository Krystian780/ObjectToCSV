package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Header {

    private final String FIRST_COLUMN_NAME;
    private final String SECOND_COLUMN_NAME;
    private final String THIRD_COLUMN_NAME;
    private final String FOURTH_COLUMN_NAME;

    public Header() {
        FIRST_COLUMN_NAME = "COMPANY";
        SECOND_COLUMN_NAME = "Q1";
        THIRD_COLUMN_NAME = "Q2";
        FOURTH_COLUMN_NAME = "Q3";
    }

    public List<String> getHeaderNames(){
        return Arrays.asList(FIRST_COLUMN_NAME, SECOND_COLUMN_NAME, THIRD_COLUMN_NAME, FOURTH_COLUMN_NAME);
    }

}
