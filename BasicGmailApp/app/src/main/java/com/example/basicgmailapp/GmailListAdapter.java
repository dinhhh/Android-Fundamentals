package com.example.basicgmailapp;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.core.content.ContextCompat;

import java.util.List;

public class GmailListAdapter extends BaseAdapter {
    private List<Gmail> gmailData;
    private LayoutInflater layoutInflater;
    private Context context;

    public GmailListAdapter(Context context, List<Gmail> gmails) {
        this.gmailData = gmails;
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }

    static class ViewHolder {
        ImageView imageView;
        TextView senderView;
        TextView titleView;
        TextView contentView;
        TextView receiveTimeView;
        ToggleButton toggleButton;
    }

    @Override
    public int getCount() {
        return gmailData.size();
    }

    @Override
    public Object getItem(int position) {
        return gmailData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView =  layoutInflater.inflate(R.layout.list_item_layout, null);
            holder = new ViewHolder();
            holder.imageView = (ImageView) convertView.findViewById(R.id.imageView);
            holder.contentView = (TextView) convertView.findViewById(R.id.contentTxtView);
            holder.senderView = (TextView) convertView.findViewById(R.id.senderTxtView);
            holder.titleView = (TextView) convertView.findViewById(R.id.titleTxtView);
            holder.receiveTimeView = (TextView) convertView.findViewById(R.id.receiveTimeTxtView);
            holder.toggleButton = (ToggleButton) convertView.findViewById(R.id.toggleButton);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        Gmail gmail = this.gmailData.get(position);
        holder.titleView.setText(gmail.getTitle());
        holder.contentView.setText(gmail.getContent());
        holder.receiveTimeView.setText(gmail.getReceiveTime());
        holder.senderView.setText(gmail.getSender());

        int imgId = this.getMipmapResIdByName(getDefaultAvatar(gmail.getSender()));
        holder.imageView.setImageResource(imgId);
        return convertView;
    }

    public int getMipmapResIdByName(String resName) {
        String pkgName = context.getPackageName();
        // Return 0 if not found.
        int resID = context.getResources().getIdentifier(resName , "mipmap", pkgName);
        Log.v("CustomListView", "Res Name: " + resName + "==> Res ID = " + resID);
        return resID;
    }

    private String getDefaultAvatar(String userName) {
        if (userName == null) {
            return "a"; // default avatar
        }
        return Character.toString(userName.toLowerCase().charAt(0));
    }
}
