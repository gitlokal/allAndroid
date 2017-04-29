package ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

import java.util.ArrayList;

/**
 * Created by bartek on 30.07.16.
 */
public class TextField extends EditText implements Observable {
    private ArrayList<Observer> observerList;

    public TextField(Context context) {
        super(context);
        init();
    }

    public TextField(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TextField(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public TextField(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    private void init() {
        observerList = new ArrayList<>();
    }

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);

    }

    @Override
    public void detach(Observer observer) {
        int i = observerList.indexOf(observer);
        if(i>0) {
            observerList.remove(observer);
        }
    }

    @Override
    public void inform() {
        for(Observer o : observerList){
            o.update();
        }
    }
}
