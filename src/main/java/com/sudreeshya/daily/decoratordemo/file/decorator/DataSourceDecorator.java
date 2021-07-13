package com.sudreeshya.daily.decoratordemo.file.decorator;

import com.sudreeshya.daily.decoratordemo.file.source.DataSource;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class DataSourceDecorator implements DataSource {

    protected final DataSource dataSource;

}
