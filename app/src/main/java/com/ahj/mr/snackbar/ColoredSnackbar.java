package com.ahj.mr.snackbar;

import android.support.design.widget.Snackbar;
import android.view.View;

public class ColoredSnackbar {

    private static final int BLUE = 0xff0463ff;
    private static final int ORANGE = 0xffffc271;
    private static final int GREEN = 0xff4caf51;
    private static final int RED = 0xfff44334;

    private static View getSnackbarLayout(Snackbar snackbar) {
        if (snackbar != null) {
            return snackbar.getView();
        }
        return null;
    }

    private static Snackbar colorSnackbar(Snackbar snackbar, int color) {
        View sbView = getSnackbarLayout(snackbar);
        if (sbView != null) {
            sbView.setBackgroundColor(color);
        }
        return snackbar;
    }

    public static Snackbar info(Snackbar snackbar) {
        return colorSnackbar(snackbar, BLUE);
    }

    public static Snackbar warning(Snackbar snackbar) {
        return colorSnackbar(snackbar, ORANGE);
    }

    public static Snackbar alert(Snackbar snackbar) {
        return colorSnackbar(snackbar, RED);
    }

    public static Snackbar success(Snackbar snackbar) {
        return colorSnackbar(snackbar, GREEN);
    }
}
