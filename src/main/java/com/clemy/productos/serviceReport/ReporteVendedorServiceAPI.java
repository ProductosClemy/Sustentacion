package com.clemy.productos.serviceReport;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

import com.clemy.productos.modelo.ReporteVentasDTO;

import net.sf.jasperreports.engine.JRException;

public interface ReporteVendedorServiceAPI {

	ReporteVentasDTO obtenerReporteVentas(Map<String, Object> params) throws JRException, IOException, SQLException;

	}