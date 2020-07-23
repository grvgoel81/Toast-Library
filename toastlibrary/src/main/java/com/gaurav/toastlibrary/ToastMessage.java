package com.gaurav.toastlibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by grvgo on 23-07-2020.
 */
public class ToastMessage {

    public static void s(Context context, String message){

        Toast.makeText(context,message, Toast.LENGTH_SHORT).show();

    }
}
