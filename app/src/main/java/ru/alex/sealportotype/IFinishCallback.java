package ru.alex.sealportotype;

import android.graphics.Bitmap;
import android.os.Bundle;

public interface IFinishCallback {
    void onFinishThread(String base64, Bitmap bitmap);

    void onSign();
}