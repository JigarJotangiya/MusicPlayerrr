package p342g.p343a.p344a.p347d;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.TextView;
import coocent.music.player.adapter.C7027j;
import coocent.musiclibrary.music.model.C7408a;
import java.util.ArrayList;
import java.util.List;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p358i.C8344t;

/* renamed from: g.a.a.d.b */
/* compiled from: EqualizerDao */
public class C7972b {

    /* renamed from: a */
    private C7971a f33681a;

    public C7972b(Context context) {
        this.f33681a = new C7971a(context);
    }

    /* renamed from: b */
    public static void m43644b(Context context, TextView textView, List<C7408a> list, C7027j jVar, int i) {
        new C7972b(context).mo29500a(list.get(i).mo28247a());
        if (textView.getText().toString().equals(list.get(i).mo28248b())) {
            textView.setText("Custom");
        }
        list.remove(i);
        jVar.notifyDataSetChanged();
        C8344t.m46316d(context, R.string.success);
    }

    /* renamed from: a */
    public void mo29500a(int i) {
        this.f33681a.getReadableDatabase().delete("equalizer", "_ID = ?", new String[]{String.valueOf(i)});
    }

    /* renamed from: c */
    public List<C7408a> mo29501c() {
        ArrayList arrayList = new ArrayList();
        Cursor query = this.f33681a.getReadableDatabase().query("equalizer", (String[]) null, (String) null, (String[]) null, (String) null, (String) null, (String) null);
        if (query != null) {
            while (query.moveToNext()) {
                C7408a aVar = new C7408a();
                aVar.mo28251d(query.getInt(query.getColumnIndex("_ID")));
                aVar.mo28252e(query.getString(query.getColumnIndex("name")));
                aVar.mo28253f(new float[]{(float) query.getInt(query.getColumnIndex("data1")), (float) query.getInt(query.getColumnIndex("data2")), (float) query.getInt(query.getColumnIndex("data3")), (float) query.getInt(query.getColumnIndex("data4")), (float) query.getInt(query.getColumnIndex("data5")), (float) query.getInt(query.getColumnIndex("data6")), (float) query.getInt(query.getColumnIndex("data7")), (float) query.getInt(query.getColumnIndex("data8")), (float) query.getInt(query.getColumnIndex("data9")), (float) query.getInt(query.getColumnIndex("data10"))});
                arrayList.add(aVar);
            }
            query.close();
        }
        return arrayList;
    }

    /* renamed from: d */
    public int mo29502d(C7408a aVar) {
        SQLiteDatabase readableDatabase = this.f33681a.getReadableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", aVar.mo28248b());
        float[] c = aVar.mo28249c();
        contentValues.put("data1", Float.valueOf(c[0]));
        contentValues.put("data2", Float.valueOf(c[1]));
        contentValues.put("data3", Float.valueOf(c[2]));
        contentValues.put("data4", Float.valueOf(c[3]));
        contentValues.put("data5", Float.valueOf(c[4]));
        contentValues.put("data6", Float.valueOf(c[5]));
        contentValues.put("data7", Float.valueOf(c[6]));
        contentValues.put("data8", Float.valueOf(c[7]));
        contentValues.put("data9", Float.valueOf(c[8]));
        contentValues.put("data10", Float.valueOf(c[9]));
        return (int) readableDatabase.insert("equalizer", "0", contentValues);
    }

    /* renamed from: e */
    public void mo29503e(int i, String str) {
        SQLiteDatabase readableDatabase = this.f33681a.getReadableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", str);
        readableDatabase.update("equalizer", contentValues, "_ID=?", new String[]{String.valueOf(i)});
    }
}
