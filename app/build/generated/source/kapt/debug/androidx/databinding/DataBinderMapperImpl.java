package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new pl.jaworskimateusz.machineservice.DataBinderMapperImpl());
  }
}
