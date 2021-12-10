/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package org.opensearch.clients.elasticsearch._types.analysis;

import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ObjectDeserializer;
import org.opensearch.clients.util.ApiTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.function.Function;

// typedef: _types.analysis.KuromojiStemmerTokenFilter

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/_types/analysis/kuromoji-plugin.ts#L47-L50">API
 *      specification</a>
 */
@JsonpDeserializable
public class KuromojiStemmerTokenFilter extends TokenFilterBase implements TokenFilterDefinitionVariant {
	private final int minimumLength;

	// ---------------------------------------------------------------------------------------------

	private KuromojiStemmerTokenFilter(Builder builder) {
		super(builder);

		this.minimumLength = ApiTypeHelper.requireNonNull(builder.minimumLength, this, "minimumLength");

	}

	public static KuromojiStemmerTokenFilter of(Function<Builder, ObjectBuilder<KuromojiStemmerTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * TokenFilterDefinition variant kind.
	 */
	@Override
	public TokenFilterDefinition.Kind _tokenFilterDefinitionKind() {
		return TokenFilterDefinition.Kind.KuromojiStemmer;
	}

	/**
	 * Required - API name: {@code minimum_length}
	 */
	public final int minimumLength() {
		return this.minimumLength;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "kuromoji_stemmer");
		super.serializeInternal(generator, mapper);
		generator.writeKey("minimum_length");
		generator.write(this.minimumLength);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link KuromojiStemmerTokenFilter}.
	 */

	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<KuromojiStemmerTokenFilter> {
		private Integer minimumLength;

		/**
		 * Required - API name: {@code minimum_length}
		 */
		public final Builder minimumLength(int value) {
			this.minimumLength = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link KuromojiStemmerTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public KuromojiStemmerTokenFilter build() {
			_checkSingleUse();

			return new KuromojiStemmerTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link KuromojiStemmerTokenFilter}
	 */
	public static final JsonpDeserializer<KuromojiStemmerTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, KuromojiStemmerTokenFilter::setupKuromojiStemmerTokenFilterDeserializer);

	protected static void setupKuromojiStemmerTokenFilterDeserializer(
			ObjectDeserializer<KuromojiStemmerTokenFilter.Builder> op) {
		setupTokenFilterBaseDeserializer(op);
		op.add(Builder::minimumLength, JsonpDeserializer.integerDeserializer(), "minimum_length");

		op.ignore("type");
	}

}