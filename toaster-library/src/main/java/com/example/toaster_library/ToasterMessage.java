package com.example.toaster_library;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class ToasterMessage {
    public static void show(Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();

        Log.i("TAG:", "info.");
    }
}
