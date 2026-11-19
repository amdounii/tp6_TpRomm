package com.iset.tproom.viewModel;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\tJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\tJ\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\tJ\u000e\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\tJ\u000e\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000b\u00a8\u0006\u001d"}, d2 = {"Lcom/iset/tproom/viewModel/EtudiantViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/iset/tproom/data/repository/EtudiantRepository;", "<init>", "(Lcom/iset/tproom/data/repository/EtudiantRepository;)V", "allEtudiants", "Landroidx/lifecycle/LiveData;", "", "Lcom/iset/tproom/data/entity/Etudiant;", "getAllEtudiants", "()Landroidx/lifecycle/LiveData;", "_selectedEtudiant", "Landroidx/lifecycle/MutableLiveData;", "selectedEtudiant", "getSelectedEtudiant", "_etudiantsSearchResults", "etudiantsSearchResults", "getEtudiantsSearchResults", "selectionnerEtudiant", "", "etudiant", "insertEtudiant", "Lkotlinx/coroutines/Job;", "delete", "update", "setSearchQuery", "query", "", "app_debug"})
public final class EtudiantViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.iset.tproom.data.repository.EtudiantRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.iset.tproom.data.entity.Etudiant>> allEtudiants = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.iset.tproom.data.entity.Etudiant> _selectedEtudiant = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.iset.tproom.data.entity.Etudiant> selectedEtudiant = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.iset.tproom.data.entity.Etudiant>> _etudiantsSearchResults = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.iset.tproom.data.entity.Etudiant>> etudiantsSearchResults = null;
    
    public EtudiantViewModel(@org.jetbrains.annotations.NotNull()
    com.iset.tproom.data.repository.EtudiantRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.iset.tproom.data.entity.Etudiant>> getAllEtudiants() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.iset.tproom.data.entity.Etudiant> getSelectedEtudiant() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.iset.tproom.data.entity.Etudiant>> getEtudiantsSearchResults() {
        return null;
    }
    
    public final void selectionnerEtudiant(@org.jetbrains.annotations.NotNull()
    com.iset.tproom.data.entity.Etudiant etudiant) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job insertEtudiant(@org.jetbrains.annotations.NotNull()
    com.iset.tproom.data.entity.Etudiant etudiant) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job delete(@org.jetbrains.annotations.NotNull()
    com.iset.tproom.data.entity.Etudiant etudiant) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job update(@org.jetbrains.annotations.NotNull()
    com.iset.tproom.data.entity.Etudiant etudiant) {
        return null;
    }
    
    public final void setSearchQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
}