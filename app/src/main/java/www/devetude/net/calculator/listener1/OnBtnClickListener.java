package www.devetude.net.calculator.listener1;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.eclipsesource.v8.V8;

import org.w3c.dom.Text;


/**
 * Created by user on 2017-01-17.
 */
public class OnBtnClickListener implements  View.OnClickListener {
    public static final int Btn_AC=-1;
    public static final int Btn_devide=-2;
    public static final int Btn_mul=-3;
    public static final int Btn_minu=-4;
    public static final int Btn_plus=-5;
    public static final int Btn_equals=-6;
    private Context context;
    private TextView resTextView;
    private static StringBuilder sb;



    public OnBtnClickListener(Context context,TextView resTrxtView) {
        this.context = context;
        this.resTextView=resTrxtView;
    this.sb =new StringBuilder();
        sb.append(resTrxtView.getText());
    }

    @Override
    public void onClick(View view) {
        Button btn = (Button) view;

        switch ((int) btn.getTag()) {
            case Btn_AC:
                sb=new StringBuilder();
                sb.append("0");
                break;
            case Btn_devide:
                sb.append("/");
                break;
            case Btn_mul:
                sb.append("*");
                break;
            case Btn_minu:
                sb.append("-");
                break;
            case Btn_plus:
               sb.append("+");
                break;
            case Btn_equals:
                V8 runtime =V8.createV8Runtime();
                int result =runtime.executeIntegerScript("eval("+sb.toString()+")");
                runtime.release();
                sb=new StringBuilder();
                sb.append(String.valueOf(result));
                break;
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                if(resTextView.getText().equals("0")){
                    sb=new StringBuilder();
                  sb.append(String.valueOf(btn.getTag()));
                }
                else{
                   sb.append(String.valueOf(btn.getTag()));
                }


                break;

        }
        resTextView.setText(sb.toString());
    }



}
