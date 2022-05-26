package com.coocent.videoplayer;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p369i.p387z.p389d.C8594l;

/* renamed from: com.coocent.videoplayer.h */
/* compiled from: PresetReverbAdapter.kt */
public final class C2699h extends RecyclerView.C0797h<C2701b> {

    /* renamed from: a */
    private final Context f9248a;

    /* renamed from: b */
    private final List<String> f9249b;

    /* renamed from: c */
    private final Map<String, Integer> f9250c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C2700a f9251d;

    /* renamed from: com.coocent.videoplayer.h$a */
    /* compiled from: PresetReverbAdapter.kt */
    public interface C2700a {
        /* renamed from: a */
        void mo10251a(int i);
    }

    /* renamed from: com.coocent.videoplayer.h$b */
    /* compiled from: PresetReverbAdapter.kt */
    public final class C2701b extends RecyclerView.C0792c0 implements View.OnClickListener {

        /* renamed from: g */
        private AppCompatTextView f9252g;

        /* renamed from: h */
        final /* synthetic */ C2699h f9253h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2701b(C2699h hVar, View view) {
            super(view);
            C8594l.m46771e(hVar, "this$0");
            C8594l.m46771e(view, "itemView");
            this.f9253h = hVar;
            View findViewById = view.findViewById(C2706m.tv_drop_down);
            C8594l.m46770d(findViewById, "itemView.findViewById(R.id.tv_drop_down)");
            this.f9252g = (AppCompatTextView) findViewById;
            view.setOnClickListener(this);
        }

        /* renamed from: a */
        public final AppCompatTextView mo10252a() {
            return this.f9252g;
        }

        public void onClick(View view) {
            C8594l.m46771e(view, "v");
            if (this.f9253h.f9251d != null) {
                C2700a c = this.f9253h.f9251d;
                C8594l.m46769c(c);
                c.mo10251a(getAbsoluteAdapterPosition());
            }
        }
    }

    public C2699h(Context context) {
        C8594l.m46771e(context, "mContext");
        this.f9248a = context;
        String[] stringArray = context.getResources().getStringArray(C2702i.video_eq_room);
        C8594l.m46770d(stringArray, "mContext.resources.getSt…ay(R.array.video_eq_room)");
        ArrayList arrayList = new ArrayList(C8482l.m46667h(Arrays.copyOf(stringArray, stringArray.length)));
        this.f9249b = arrayList;
        this.f9250c = new LinkedHashMap(arrayList.size());
        int size = arrayList.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                this.f9250c.put(this.f9249b.get(i), Integer.valueOf(i));
                if (i2 <= size) {
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: d */
    public final String mo10246d(int i) {
        return this.f9249b.get(i);
    }

    /* renamed from: e */
    public final int mo10247e(int i) {
        Integer num = this.f9250c.get(this.f9249b.get(i));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: f */
    public void onBindViewHolder(C2701b bVar, int i) {
        C8594l.m46771e(bVar, "holder");
        String str = this.f9249b.get(i);
        if (!TextUtils.isEmpty(str)) {
            bVar.mo10252a().setText(str);
        }
    }

    /* renamed from: g */
    public C2701b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C8594l.m46771e(viewGroup, "parent");
        View inflate = LayoutInflater.from(this.f9248a).inflate(C2707n.video_layout_item_drop_down, viewGroup, false);
        C8594l.m46770d(inflate, "view");
        return new C2701b(this, inflate);
    }

    public int getItemCount() {
        return this.f9249b.size();
    }

    /* renamed from: h */
    public final void mo10250h(C2700a aVar) {
        this.f9251d = aVar;
    }
}
