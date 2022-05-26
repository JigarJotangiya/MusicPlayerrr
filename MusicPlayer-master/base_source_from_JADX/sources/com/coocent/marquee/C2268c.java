package com.coocent.marquee;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.coocent.marquee.p055y.C2333a;
import com.coocent.marquee.view.MarqueeCircleColorView;
import java.util.ArrayList;

/* renamed from: com.coocent.marquee.c */
/* compiled from: MarqueeColorRecyclerAdapter */
public class C2268c extends RecyclerView.C0797h<C2271c> {

    /* renamed from: a */
    private ArrayList<C2277g> f7814a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C2270b f7815b;

    /* renamed from: c */
    private boolean f7816c = false;

    /* renamed from: com.coocent.marquee.c$a */
    /* compiled from: MarqueeColorRecyclerAdapter */
    class C2269a implements View.OnTouchListener {

        /* renamed from: g */
        final /* synthetic */ C2271c f7817g;

        C2269a(C2271c cVar) {
            this.f7817g = cVar;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (C2268c.this.f7815b == null || motionEvent.getAction() != 0) {
                return false;
            }
            C2268c.this.f7815b.mo8998l1(this.f7817g);
            return false;
        }
    }

    /* renamed from: com.coocent.marquee.c$b */
    /* compiled from: MarqueeColorRecyclerAdapter */
    public interface C2270b {
        /* renamed from: b */
        void mo8997b(int i);

        /* renamed from: l1 */
        void mo8998l1(RecyclerView.C0792c0 c0Var);

        /* renamed from: o */
        void mo8999o(int i);

        /* renamed from: x */
        void mo9000x(View view, int i);
    }

    /* renamed from: com.coocent.marquee.c$c */
    /* compiled from: MarqueeColorRecyclerAdapter */
    class C2271c extends RecyclerView.C0792c0 {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final MarqueeCircleColorView f7819a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final ImageView f7820b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final ImageView f7821c;

        /* renamed from: com.coocent.marquee.c$c$a */
        /* compiled from: MarqueeColorRecyclerAdapter */
        class C2272a implements View.OnClickListener {
            C2272a(C2268c cVar) {
            }

            public void onClick(View view) {
                if (C2268c.this.f7815b == null) {
                    return;
                }
                if (C2271c.this.getAdapterPosition() == 0) {
                    C2268c.this.f7815b.mo8999o(C2271c.this.getAdapterPosition());
                } else {
                    C2268c.this.f7815b.mo8997b(C2271c.this.getAdapterPosition());
                }
            }
        }

        /* renamed from: com.coocent.marquee.c$c$b */
        /* compiled from: MarqueeColorRecyclerAdapter */
        class C2273b implements View.OnClickListener {
            C2273b(C2268c cVar) {
            }

            public void onClick(View view) {
                if (C2268c.this.f7815b != null) {
                    C2268c.this.f7815b.mo9000x(view, C2271c.this.getAdapterPosition());
                }
            }
        }

        public C2271c(View view) {
            super(view);
            ImageView imageView = (ImageView) view.findViewById(C2308s.img_color_add);
            this.f7821c = imageView;
            imageView.setImageDrawable(C2333a.f8191a.mo9134e(view.getResources(), C2307r.ic_icon_addcolor, C2298o.m10758e1()));
            MarqueeCircleColorView marqueeCircleColorView = (MarqueeCircleColorView) view.findViewById(C2308s.marqueeCircleColorView);
            this.f7819a = marqueeCircleColorView;
            marqueeCircleColorView.setOnClickListener(new C2272a(C2268c.this));
            ImageView imageView2 = (ImageView) view.findViewById(C2308s.deleteImg);
            this.f7820b = imageView2;
            imageView2.setOnClickListener(new C2273b(C2268c.this));
        }
    }

    public C2268c(Context context, ArrayList<C2277g> arrayList, C2270b bVar) {
        this.f7814a = arrayList;
        this.f7815b = bVar;
    }

    /* renamed from: d */
    public void onBindViewHolder(C2271c cVar, int i) {
        int i2 = 8;
        if (i != 0 || this.f7815b == null) {
            cVar.f7821c.setVisibility(4);
            cVar.f7820b.setVisibility(0);
            ImageView b = cVar.f7820b;
            if (this.f7816c && this.f7814a.size() > 2) {
                i2 = 0;
            }
            b.setVisibility(i2);
            MarqueeCircleColorView d = cVar.f7819a;
            ArrayList<C2277g> arrayList = this.f7814a;
            if (this.f7815b != null) {
                i--;
            }
            d.setColor(Color.parseColor(arrayList.get(i).mo9003a()));
            if (this.f7816c) {
                cVar.f7819a.setOnTouchListener(new C2269a(cVar));
            } else {
                cVar.f7819a.setOnTouchListener((View.OnTouchListener) null);
            }
        } else {
            cVar.f7821c.setVisibility(0);
            cVar.f7820b.setVisibility(8);
            String format = String.format("%08X", new Object[]{Integer.valueOf(C2298o.m10758e1())});
            cVar.f7819a.setSolidColor(Color.parseColor("#0F" + format.substring(2)));
            cVar.f7819a.setOnTouchListener((View.OnTouchListener) null);
        }
    }

    /* renamed from: e */
    public C2271c onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C2271c(LayoutInflater.from(viewGroup.getContext()).inflate(C2310t.marquee_adapter_color, viewGroup, false));
    }

    /* renamed from: f */
    public void mo8994f(boolean z) {
        this.f7816c = z;
    }

    /* renamed from: g */
    public void mo8995g(C2270b bVar) {
        this.f7815b = bVar;
    }

    public int getItemCount() {
        return this.f7815b != null ? this.f7814a.size() + 1 : this.f7814a.size();
    }
}
