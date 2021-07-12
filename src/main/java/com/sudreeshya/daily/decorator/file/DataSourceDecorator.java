package com.sudreeshya.daily.decorator.file;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class DataSourceDecorator implements DataSource{

    protected final DataSource dataSource;

}
