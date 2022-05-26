package coocent.music.player.adapter;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import coocent.musiclibrary.music.model.C7408a;
import java.util.List;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p346c.C7955h;
import p342g.p343a.p344a.p346c.C7957j;

/* renamed from: coocent.music.player.adapter.j */
/* compiled from: PresetAdapter */
public class C7027j extends RecyclerView.C0797h<C7028a> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C7955h f31126a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C7957j f31127b;

    /* renamed from: c */
    private boolean f31128c = false;

    /* renamed from: d */
    private List<C7408a> f31129d;

    /* renamed from: coocent.music.player.adapter.j$a */
    /* compiled from: PresetAdapter */
    class C7028a extends RecyclerView.C0792c0 {

        /* renamed from: a */
        private final TextView f31130a;

        /* renamed from: coocent.music.player.adapter.j$a$a */
        /* compiled from: PresetAdapter */
        class C7029a implements View.OnClickListener {
            C7029a(C7027j jVar) {
            }

            public void onClick(View view) {
                if (C7027j.this.f31126a != null) {
                    C7027j.this.f31126a.mo27566a(C7028a.this.getPosition());
                }
            }
        }

        /* renamed from: coocent.music.player.adapter.j$a$b */
        /* compiled from: PresetAdapter */
        class C7030b implements View.OnLongClickListener {
            C7030b(C7027j jVar) {
            }

            public boolean onLongClick(View view) {
                if (C7027j.this.f31127b == null) {
                    return true;
                }
                C7027j.this.f31127b.mo27567a(C7028a.this.getPosition());
                return true;
            }
        }

        public C7028a(View view) {
            super(view);
            this.f31130a = (TextView) view.findViewById(R.id.eqText);
            view.findViewById(R.id.itemLayout).setOnClickListener(new C7029a(C7027j.this));
            view.findViewById(R.id.itemLayout).setOnLongClickListener(new C7030b(C7027j.this));
        }

        /* renamed from: a */
        public TextView mo26936a() {
            return this.f31130a;
        }
    }

    public C7027j(List<C7408a> list) {
        this.f31129d = list;
    }

    /* renamed from: e */
    public void onBindViewHolder(C7028a aVar, int i) {
        if (!this.f31128c) {
            aVar.mo26936a().setText(this.f31129d.get(i).mo28248b());
            aVar.mo26936a().setTextColor(-1);
        } else if (i == 0) {
            aVar.mo26936a().setText(R.string.eq_save);
            aVar.mo26936a().setTextColor(Color.parseColor("#00FF00"));
        } else {
            aVar.mo26936a().setText(this.f31129d.get(i - 1).mo28248b());
            aVar.mo26936a().setTextColor(-1);
        }
    }

    /* renamed from: f */
    public C7028a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C7028a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.eqlist_item, viewGroup, false));
    }

    /* renamed from: g */
    public void mo26933g(C7955h hVar) {
        this.f31126a = hVar;
    }

    public int getItemCount() {
        return this.f31128c ? this.f31129d.size() + 1 : this.f31129d.size();
    }

    /* renamed from: h */
    public void mo26934h(C7957j jVar) {
        this.f31127b = jVar;
    }

    /* renamed from: i */
    public void mo26935i(boolean z) {
        this.f31128c = z;
    }
}
