package com.ahj.mr.snackbar;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CoordinatorLayout coordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    public void init() {
        coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coordinator_layout);
    }

    public void simpleSnackbar(View view) {
        Snackbar.make(coordinatorLayout, "Simple Snackbar ...", Snackbar.LENGTH_INDEFINITE).show();
    }

    public void snackbarWithAction(View view) {
        Snackbar.make(coordinatorLayout, "No Internet Connection", Snackbar.LENGTH_LONG)
                .setAction("Retry", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Snackbar.make(coordinatorLayout, "connecting ...", Snackbar.LENGTH_LONG)
                                .show();
                    }
                })
                .show();
    }

    public void customSnackbar(View view) {
        Snackbar snackbar = Snackbar.make(coordinatorLayout, "No Internet Connection", Snackbar.LENGTH_LONG)
                .setAction("Retry", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Snackbar.make(coordinatorLayout, "connecting ...", Snackbar.LENGTH_LONG)
                                .show();
                    }
                });
        snackbar.setActionTextColor(Color.rgb(100, 70, 200));
        View snackbarView = snackbar.getView();
        TextView snackbarTextView = (TextView) snackbarView.findViewById(android.support.design.R.id.snackbar_text);
        snackbarTextView.setTextColor(Color.YELLOW);
        snackbar.show();
    }

    public void infoSnackbar(View view) {
        Snackbar snackbar = Snackbar.make(coordinatorLayout, "No Internet Connection", Snackbar.LENGTH_LONG)
                .setAction("Retry", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Snackbar.make(coordinatorLayout, "connecting ...", Snackbar.LENGTH_LONG)
                                .show();
                    }
                });
        ColoredSnackbar.info(snackbar).show();

    }

    public void warningSnackbar(View view) {
        Snackbar snackbar = Snackbar.make(coordinatorLayout, "Warning Snackbar", Snackbar.LENGTH_INDEFINITE);
        ColoredSnackbar.warning(snackbar).show();
    }

    public void alertSnackbar(View view) {
        Snackbar snackbar = Snackbar.make(coordinatorLayout, "Warning Snackbar", Snackbar.LENGTH_INDEFINITE);
        ColoredSnackbar.alert(snackbar).show();
    }

    public void successSnackbar(View view) {
        Snackbar snackbar = Snackbar.make(coordinatorLayout, "Warning Snackbar", Snackbar.LENGTH_INDEFINITE);
        ColoredSnackbar.success(snackbar).show();
    }
}
