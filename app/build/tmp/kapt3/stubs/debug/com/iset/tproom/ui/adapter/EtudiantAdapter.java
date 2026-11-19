package com.iset.tproom.ui.adapter;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0018BQ\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\b2\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0016J\u0014\u0010\u0016\u001a\u00020\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/iset/tproom/ui/adapter/EtudiantAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/iset/tproom/ui/adapter/EtudiantAdapter$EtudiantViewHolder;", "etudiants", "", "Lcom/iset/tproom/data/entity/Etudiant;", "onItemClick", "Lkotlin/Function1;", "", "onItemLongClick", "onItemUpdate", "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "holder", "position", "getItemCount", "updateList", "newList", "EtudiantViewHolder", "app_debug"})
public final class EtudiantAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.iset.tproom.ui.adapter.EtudiantAdapter.EtudiantViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.iset.tproom.data.entity.Etudiant> etudiants;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.iset.tproom.data.entity.Etudiant, kotlin.Unit> onItemClick = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.iset.tproom.data.entity.Etudiant, kotlin.Unit> onItemLongClick = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.iset.tproom.data.entity.Etudiant, kotlin.Unit> onItemUpdate = null;
    
    public EtudiantAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.iset.tproom.data.entity.Etudiant> etudiants, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.iset.tproom.data.entity.Etudiant, kotlin.Unit> onItemClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.iset.tproom.data.entity.Etudiant, kotlin.Unit> onItemLongClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.iset.tproom.data.entity.Etudiant, kotlin.Unit> onItemUpdate) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.iset.tproom.ui.adapter.EtudiantAdapter.EtudiantViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.iset.tproom.ui.adapter.EtudiantAdapter.EtudiantViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void updateList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.iset.tproom.data.entity.Etudiant> newList) {
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/iset/tproom/ui/adapter/EtudiantAdapter$EtudiantViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/iset/tproom/databinding/ItemEtudiantBinding;", "<init>", "(Lcom/iset/tproom/ui/adapter/EtudiantAdapter;Lcom/iset/tproom/databinding/ItemEtudiantBinding;)V", "getBinding", "()Lcom/iset/tproom/databinding/ItemEtudiantBinding;", "app_debug"})
    public final class EtudiantViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.iset.tproom.databinding.ItemEtudiantBinding binding = null;
        
        public EtudiantViewHolder(@org.jetbrains.annotations.NotNull()
        com.iset.tproom.databinding.ItemEtudiantBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.iset.tproom.databinding.ItemEtudiantBinding getBinding() {
            return null;
        }
    }
}