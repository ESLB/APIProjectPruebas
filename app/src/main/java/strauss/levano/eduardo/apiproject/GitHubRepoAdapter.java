package strauss.levano.eduardo.apiproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

//Adaptador para la "ListView"
public class GitHubRepoAdapter extends ArrayAdapter<GitHubRepo> {


    private Context context;
    private List<GitHubRepo> values;

    //Constructor
    public GitHubRepoAdapter(Context context, List<GitHubRepo> values) {
        super(context, R.layout.list_item_pagination, values);
        this.context = context;
        this.values = values;
    }

    //GetView necesaria de la clase para crear la vista que queremos
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //Checkeamos si ya hay un LayoutInflater, copy-paste code
        View row = convertView;
        if (row == null) {
            LayoutInflater inflater =
                    (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.list_item_pagination, parent, false);
        }

        //Wiring things up
        TextView textView = (TextView) row.findViewById(R.id.list_item_pagination_text);
        GitHubRepo item = values.get(position);
        String message = item.getName();
        textView.setText(message);

        return row;
    }

}
