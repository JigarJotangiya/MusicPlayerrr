package coocent.musiclibrary.music.folder.p288ui;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import coocent.musiclibrary.music.folder.p288ui.C7359a;
import coocent.musiclibrary.music.folder.widget.EmptyRecyclerView;
import coocent.musiclibrary.music.p285f.p286b.C7347a;
import coocent.musiclibrary.music.p285f.p287c.C7353c;
import java.io.File;
import p342g.p359b.C8350d;
import p342g.p359b.C8351e;

/* renamed from: coocent.musiclibrary.music.folder.ui.DirectoryFragment */
public class DirectoryFragment extends Fragment {

    /* renamed from: g */
    private View f32397g;

    /* renamed from: h */
    private String f32398h;

    /* renamed from: i */
    private C7347a f32399i;

    /* renamed from: j */
    private EmptyRecyclerView f32400j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C7359a f32401k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C7355b f32402l;

    /* renamed from: coocent.musiclibrary.music.folder.ui.DirectoryFragment$a */
    class C7354a implements C7359a.C7362b {
        C7354a() {
        }

        /* renamed from: a */
        public void mo28111a(View view, int i) {
            if (DirectoryFragment.this.f32402l != null) {
                DirectoryFragment.this.f32402l.mo28112u(DirectoryFragment.this.f32401k.mo28115c(i));
            }
        }
    }

    /* renamed from: coocent.musiclibrary.music.folder.ui.DirectoryFragment$b */
    interface C7355b {
        /* renamed from: u */
        void mo28112u(File file);
    }

    /* renamed from: c */
    public static DirectoryFragment m41553c(String str, C7347a aVar) {
        DirectoryFragment directoryFragment = new DirectoryFragment();
        Bundle bundle = new Bundle();
        bundle.putString("arg_file_path", str);
        bundle.putSerializable("arg_filter", aVar);
        directoryFragment.setArguments(bundle);
        return directoryFragment;
    }

    /* renamed from: d */
    private void m41554d() {
        if (getArguments().getString("arg_file_path") != null) {
            this.f32398h = getArguments().getString("arg_file_path");
        }
        this.f32399i = (C7347a) getArguments().getSerializable("arg_filter");
    }

    /* renamed from: e */
    private void m41555e() {
        C7359a aVar = new C7359a(getActivity(), C7353c.m41550b(this.f32398h, this.f32399i));
        this.f32401k = aVar;
        aVar.mo28118f(new C7354a());
        this.f32400j.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f32400j.setAdapter(this.f32401k);
        this.f32400j.setEmptyView(this.f32397g);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f32402l = (C7355b) activity;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C8351e.fragment_directory, viewGroup, false);
        this.f32400j = (EmptyRecyclerView) inflate.findViewById(C8350d.directory_recycler_view);
        this.f32397g = inflate.findViewById(C8350d.directory_empty_view);
        return inflate;
    }

    public void onDetach() {
        super.onDetach();
        this.f32402l = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m41554d();
        m41555e();
    }
}
