//package com.example.rentalz;
//
//import android.app.Activity;
//import android.view.View;
//import android.view.ViewGroup;
//import android.view.LayoutInflater;
//import android.widget.BaseAdapter;
//import android.widget.TextView;
//
//import java.util.List;
//import android.app.Activity;
//import android.view.View;
//import android.view.ViewGroup;
//import android.view.LayoutInflater;
//import android.widget.BaseAdapter;
//import android.widget.TextView;
//
//import java.util.List;
//
//public class CustomAdapter extends BaseAdapter  {
//
//    private LayoutInflater flater;
//    private List<Address> list;
//    private int listItemLayoutResource;
//    private int textViewItemNameId;
//    private int textViewItemPercentId;
//
//
//    // Arguments example:
//    //  @listItemLayoutResource: R.layout.spinner_item_layout_resource
//    //        (File: layout/spinner_item_layout_resource.xmll)
//    //  @textViewItemNameId: R.id.textView_item_name
//    //        (A TextVew in file layout/spinner_item_layout_resource.xmlxml)
//    //  @textViewItemPercentId: R.id.textView_item_percent
//    //        (A TextVew in file layout/spinner_item_layout_resource.xmll)
//    public CustomAdapter(Activity context, int listItemLayoutResource,
//                         int textViewItemNameId, int textViewItemPercentId,
//                         List<Address> list) {
//        this.listItemLayoutResource = listItemLayoutResource;
//
//        this.textViewItemNameId = textViewItemNameId;
//        this.textViewItemPercentId = textViewItemPercentId;
//        this.list = list;
//        this.flater = context.getLayoutInflater();
//    }
//
//    @Override
//    public int getCount() {
//        if(this.list == null)  {
//            return 0;
//        }
//        return this.list.size();
//    }
//
//    @Override
//    public Object getItem(int position) {
//        return this.list.get(position);
//    }
//
//    @Override
//    public long getItemId(int position) {
//        Address language = (Address) this.getItem(position);
//        return Long.parseLong(language.getCode());
//        // return position; (Return position if you need).
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//
//        Address language = (Address) getItem(position);
//
//        // Example: @listItemLayoutResource: R.layout.spinner_item_layout_resource
//        // (File: layout/spinner_item_layout_resourcerce.xml)
//        View rowView = this.flater.inflate(this.listItemLayoutResource, null,true);
//
//        // Example: @textViewItemNameId: R.id.textView_item_name
//        // (A TextView in file layout/spinner_item_layout_resourcerce.xml)
//        TextView textViewItemName = (TextView) rowView.findViewById(this.textViewItemNameId);
//        textViewItemName.setText(language.getName());
//
//        // Example: @textViewItemPercentId: R.id.textView_item_percent
//        // (A TextView in file layout/spinner_item_layout_resource.xmlxml)
//        TextView textViewItemPercent = (TextView) rowView.findViewById(textViewItemPercentId);
//        textViewItemPercent.setText(language.getCode() + "%");
//
//        return rowView;
//    }
//}
