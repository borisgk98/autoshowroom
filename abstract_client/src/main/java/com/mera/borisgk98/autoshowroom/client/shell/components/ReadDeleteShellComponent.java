package com.mera.borisgk98.autoshowroom.client.shell.components;

import org.springframework.shell.table.Table;

public interface ReadDeleteShellComponent<T> {
    Table readAll();
    Table readWithLimitAndOffset(Integer limit, Integer offset);
    String read(Integer id);
    String delete(Integer id);
}
