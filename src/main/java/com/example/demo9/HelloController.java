package com.example.demo9;

import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class HelloController {
    public TextField m_link;
    public TextField p_link;
    public Button d_button;
    public ProgressBar progress;


    public void download(MouseEvent mouseEvent) throws Exception {

        if(!m_link.getText().isEmpty() && !p_link.getText().isEmpty()){
            DownloadApi.download(m_link.getText(), "mmmusic.mp3", progress);
            DownloadApi.download(p_link.getText(), "ppphoto.jpeg", progress);
        }
    }

    public void changed(KeyEvent keyEvent) {
        progress.setProgress(0);
    }
}