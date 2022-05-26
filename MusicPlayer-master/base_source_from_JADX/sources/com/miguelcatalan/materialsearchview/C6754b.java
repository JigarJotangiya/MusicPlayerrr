package com.miguelcatalan.materialsearchview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import media.musicplayer.audioplayer.videoplayer.R;

/* renamed from: com.miguelcatalan.materialsearchview.b */
/* compiled from: SearchAdapter */
public class C6754b extends BaseAdapter implements Filterable {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ArrayList<String> f30237g = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String[] f30238h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Drawable f30239i;

    /* renamed from: j */
    private LayoutInflater f30240j;

    /* renamed from: k */
    private boolean f30241k;

    /* renamed from: com.miguelcatalan.materialsearchview.b$a */
    /* compiled from: SearchAdapter */
    class C6755a extends Filter {
        C6755a() {
        }

        /* access modifiers changed from: protected */
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            Filter.FilterResults filterResults = new Filter.FilterResults();
            if (!TextUtils.isEmpty(charSequence)) {
                ArrayList arrayList = new ArrayList();
                for (String str : C6754b.this.f30238h) {
                    if (str.toLowerCase().contains(charSequence.toString().toLowerCase()) || charSequence.toString().toLowerCase().contains(str.toLowerCase())) {
                        arrayList.add(str);
                    }
                }
                filterResults.values = arrayList;
                filterResults.count = arrayList.size();
            }
            return filterResults;
        }

        /* access modifiers changed from: protected */
        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            Object obj = filterResults.values;
            if (obj != null) {
                ArrayList unused = C6754b.this.f30237g = (ArrayList) obj;
                C6754b.this.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: com.miguelcatalan.materialsearchview.b$b */
    /* compiled from: SearchAdapter */
    private class C6756b {

        /* renamed from: a */
        TextView f30243a;

        /* renamed from: b */
        ImageView f30244b;

        public C6756b(C6754b bVar, View view) {
            this.f30243a = (TextView) view.findViewById(R.id.suggestion_text);
            if (bVar.f30239i != null) {
                ImageView imageView = (ImageView) view.findViewById(R.id.suggestion_icon);
                this.f30244b = imageView;
                imageView.setImageDrawable(bVar.f30239i);
            }
        }
    }

    public C6754b(Context context, String[] strArr, Drawable drawable, boolean z) {
        this.f30240j = LayoutInflater.from(context);
        this.f30238h = strArr;
        this.f30239i = drawable;
        this.f30241k = z;
    }

    public int getCount() {
        return this.f30237g.size();
    }

    public Filter getFilter() {
        return new C6755a();
    }

    public Object getItem(int i) {
        return this.f30237g.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C6756b bVar;
        if (view == null) {
            view = this.f30240j.inflate(R.layout.suggest_item, viewGroup, false);
            bVar = new C6756b(this, view);
            view.setTag(bVar);
        } else {
            bVar = (C6756b) view.getTag();
        }
        bVar.f30243a.setText((String) getItem(i));
        if (this.f30241k) {
            bVar.f30243a.setSingleLine();
            bVar.f30243a.setEllipsize(TextUtils.TruncateAt.END);
        }
        return view;
    }
}
