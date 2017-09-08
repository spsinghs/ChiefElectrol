package in.nic.ceopunjab.chiefelectrolpunjab;

import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by admin on 3/27/2017.
 */

 public class SearchRollFragment extends Fragment {
    View myView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView=inflater.inflate(R.layout.searchroll_layout,container,false);
        //return super.onCreateView(inflater, container, savedInstanceState);

        RadioGroup grpRadio= (RadioGroup) this.myView.findViewById(R.id.radioGroup);
      //  final EditText epicText= (EditText) this.myView.findViewById(R.id.textEpic);
        //final TextView distLbl= (TextView) this.myView.findViewById(R.id.tvDist);
        //final Spinner distSpn= (Spinner) this.myView.findViewById(R.id.spinner);
        final LinearLayout ly1=(LinearLayout) this.myView.findViewById(R.id.linear1);
        final LinearLayout ly2=(LinearLayout) this.myView.findViewById(R.id.linear2);
        Spinner dist=(Spinner) this.myView.findViewById(R.id.spnDist);
        String[] list = getResources().getStringArray(R.array.spn_district);
       // ArrayAdapter<String> adapter=new ArrayAdapter<String> (this,R.layout.spinner_layout,R.id.txt,list);
        //dist.setAdapter(adapter);
        grpRadio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton)
                {
                    ly1.setVisibility(View.VISIBLE);
                    ly2.setVisibility(View.GONE);
                    //distLbl.setVisibility(View.GONE);
                    //distSpn.setVisibility(View.GONE);

                }
                else if(checkedId==R.id.radioButton2)
                {
                    ly1.setVisibility(View.GONE);
                    ly2.setVisibility(View.VISIBLE);
                    //distLbl.setVisibility(View.VISIBLE);
                    //distSpn.setVisibility(View.VISIBLE);

                }
            }
        });
        return myView;

    }
}
