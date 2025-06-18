package com.example.mostusedwords;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class WordCounter {
    @FXML
    private Label sumLabel;

    @FXML
    private TextArea myTextArea;

    @FXML
    protected void getSum(){
        int maxCount = 0;
        String word = "";
        String removeCommas = myTextArea.getText().replace(",", "");
        String[] sumLabelSplit = removeCommas.split(" ");

        int count = 0;
        for(int i = 0; i < sumLabelSplit.length; i++){
            count = 1;
            for(int j = i+1; j < sumLabelSplit.length; j++){
                if(sumLabelSplit[i].equals(sumLabelSplit[j])){
                    count++;
                }

                if(count > maxCount){
                    maxCount = count;
                    word = sumLabelSplit[i];
                }
            }
        }
        sumLabel.setText(word + " seen " + maxCount + " times");
    }
}
