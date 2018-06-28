package es.redmic.exception.elasticsearch;

import java.util.Arrays;

import es.redmic.exception.common.BadRequestException;
import es.redmic.exception.common.ExceptionType;

public class ESHistogramIntervalQueryException extends BadRequestException {

	private static final long serialVersionUID = 3658782399097632577L;

	public ESHistogramIntervalQueryException(String interval) {
		super(ExceptionType.ES_HISTOGRAM_INTERVAL_QUERY_ERROR);
		setFieldErrors(Arrays.asList(interval));
	}
}
