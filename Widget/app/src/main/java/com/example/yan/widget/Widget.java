package com.example.yan.widget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.widget.RemoteViews;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by YAN on 2016/8/13.
 */
public class Widget extends AppWidgetProvider
{
    //Define the format string for the  data
    private SimpleDateFormat formatter=new SimpleDateFormat("EEEEEEEEE\nd MMM yyyy");
    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager,int[] appWidgetIds)
    {
        //Retrieve and format the current data
        String now=formatter.format(new Date());
        //Change the text in the widget
        RemoteViews updateViews=new RemoteViews(context.getPackageName(),R.layout.main);
        updateViews.setTextViewText(R.id.text,now);
        appWidgetManager.updateAppWidget(appWidgetIds,updateViews);
        //Not really necessary just a habit
        super.onUpdate(context,appWidgetManager,appWidgetIds);
    }
}
