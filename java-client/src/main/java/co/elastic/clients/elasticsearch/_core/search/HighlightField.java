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

package co.elastic.clients.elasticsearch._core.search;

import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.HighlightField
@JsonpDeserializable
public final class HighlightField implements JsonpSerializable {
	@Nullable
	private final String boundaryChars;

	@Nullable
	private final Integer boundaryMaxScan;

	@Nullable
	private final BoundaryScanner boundaryScanner;

	@Nullable
	private final String boundaryScannerLocale;

	@Nullable
	private final String field;

	@Nullable
	private final Boolean forceSource;

	@Nullable
	private final HighlighterFragmenter fragmenter;

	@Nullable
	private final Integer fragmentOffset;

	@Nullable
	private final Integer fragmentSize;

	@Nullable
	private final Query highlightQuery;

	@Nullable
	private final List<String> matchedFields;

	@Nullable
	private final Integer maxFragmentLength;

	@Nullable
	private final Integer noMatchSize;

	@Nullable
	private final Integer numberOfFragments;

	@Nullable
	private final HighlighterOrder order;

	@Nullable
	private final Integer phraseLimit;

	@Nullable
	private final List<String> postTags;

	@Nullable
	private final List<String> preTags;

	@Nullable
	private final Boolean requireFieldMatch;

	@Nullable
	private final HighlighterTagsSchema tagsSchema;

	@Nullable
	private final HighlighterType type;

	// ---------------------------------------------------------------------------------------------

	public HighlightField(Builder builder) {

		this.boundaryChars = builder.boundaryChars;
		this.boundaryMaxScan = builder.boundaryMaxScan;
		this.boundaryScanner = builder.boundaryScanner;
		this.boundaryScannerLocale = builder.boundaryScannerLocale;
		this.field = builder.field;
		this.forceSource = builder.forceSource;
		this.fragmenter = builder.fragmenter;
		this.fragmentOffset = builder.fragmentOffset;
		this.fragmentSize = builder.fragmentSize;
		this.highlightQuery = builder.highlightQuery;
		this.matchedFields = ModelTypeHelper.unmodifiable(builder.matchedFields);
		this.maxFragmentLength = builder.maxFragmentLength;
		this.noMatchSize = builder.noMatchSize;
		this.numberOfFragments = builder.numberOfFragments;
		this.order = builder.order;
		this.phraseLimit = builder.phraseLimit;
		this.postTags = ModelTypeHelper.unmodifiable(builder.postTags);
		this.preTags = ModelTypeHelper.unmodifiable(builder.preTags);
		this.requireFieldMatch = builder.requireFieldMatch;
		this.tagsSchema = builder.tagsSchema;
		this.type = builder.type;

	}

	public HighlightField(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code boundary_chars}
	 */
	@Nullable
	public String boundaryChars() {
		return this.boundaryChars;
	}

	/**
	 * API name: {@code boundary_max_scan}
	 */
	@Nullable
	public Integer boundaryMaxScan() {
		return this.boundaryMaxScan;
	}

	/**
	 * API name: {@code boundary_scanner}
	 */
	@Nullable
	public BoundaryScanner boundaryScanner() {
		return this.boundaryScanner;
	}

	/**
	 * API name: {@code boundary_scanner_locale}
	 */
	@Nullable
	public String boundaryScannerLocale() {
		return this.boundaryScannerLocale;
	}

	/**
	 * API name: {@code field}
	 */
	@Nullable
	public String field() {
		return this.field;
	}

	/**
	 * API name: {@code force_source}
	 */
	@Nullable
	public Boolean forceSource() {
		return this.forceSource;
	}

	/**
	 * API name: {@code fragmenter}
	 */
	@Nullable
	public HighlighterFragmenter fragmenter() {
		return this.fragmenter;
	}

	/**
	 * API name: {@code fragment_offset}
	 */
	@Nullable
	public Integer fragmentOffset() {
		return this.fragmentOffset;
	}

	/**
	 * API name: {@code fragment_size}
	 */
	@Nullable
	public Integer fragmentSize() {
		return this.fragmentSize;
	}

	/**
	 * API name: {@code highlight_query}
	 */
	@Nullable
	public Query highlightQuery() {
		return this.highlightQuery;
	}

	/**
	 * API name: {@code matched_fields}
	 */
	@Nullable
	public List<String> matchedFields() {
		return this.matchedFields;
	}

	/**
	 * API name: {@code max_fragment_length}
	 */
	@Nullable
	public Integer maxFragmentLength() {
		return this.maxFragmentLength;
	}

	/**
	 * API name: {@code no_match_size}
	 */
	@Nullable
	public Integer noMatchSize() {
		return this.noMatchSize;
	}

	/**
	 * API name: {@code number_of_fragments}
	 */
	@Nullable
	public Integer numberOfFragments() {
		return this.numberOfFragments;
	}

	/**
	 * API name: {@code order}
	 */
	@Nullable
	public HighlighterOrder order() {
		return this.order;
	}

	/**
	 * API name: {@code phrase_limit}
	 */
	@Nullable
	public Integer phraseLimit() {
		return this.phraseLimit;
	}

	/**
	 * API name: {@code post_tags}
	 */
	@Nullable
	public List<String> postTags() {
		return this.postTags;
	}

	/**
	 * API name: {@code pre_tags}
	 */
	@Nullable
	public List<String> preTags() {
		return this.preTags;
	}

	/**
	 * API name: {@code require_field_match}
	 */
	@Nullable
	public Boolean requireFieldMatch() {
		return this.requireFieldMatch;
	}

	/**
	 * API name: {@code tags_schema}
	 */
	@Nullable
	public HighlighterTagsSchema tagsSchema() {
		return this.tagsSchema;
	}

	/**
	 * API name: {@code type}
	 */
	@Nullable
	public HighlighterType type() {
		return this.type;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.boundaryChars != null) {

			generator.writeKey("boundary_chars");
			generator.write(this.boundaryChars);

		}
		if (this.boundaryMaxScan != null) {

			generator.writeKey("boundary_max_scan");
			generator.write(this.boundaryMaxScan);

		}
		if (this.boundaryScanner != null) {

			generator.writeKey("boundary_scanner");
			this.boundaryScanner.serialize(generator, mapper);
		}
		if (this.boundaryScannerLocale != null) {

			generator.writeKey("boundary_scanner_locale");
			generator.write(this.boundaryScannerLocale);

		}
		if (this.field != null) {

			generator.writeKey("field");
			generator.write(this.field);

		}
		if (this.forceSource != null) {

			generator.writeKey("force_source");
			generator.write(this.forceSource);

		}
		if (this.fragmenter != null) {

			generator.writeKey("fragmenter");
			this.fragmenter.serialize(generator, mapper);
		}
		if (this.fragmentOffset != null) {

			generator.writeKey("fragment_offset");
			generator.write(this.fragmentOffset);

		}
		if (this.fragmentSize != null) {

			generator.writeKey("fragment_size");
			generator.write(this.fragmentSize);

		}
		if (this.highlightQuery != null) {

			generator.writeKey("highlight_query");
			this.highlightQuery.serialize(generator, mapper);

		}
		if (this.matchedFields != null) {

			generator.writeKey("matched_fields");
			generator.writeStartArray();
			for (String item0 : this.matchedFields) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.maxFragmentLength != null) {

			generator.writeKey("max_fragment_length");
			generator.write(this.maxFragmentLength);

		}
		if (this.noMatchSize != null) {

			generator.writeKey("no_match_size");
			generator.write(this.noMatchSize);

		}
		if (this.numberOfFragments != null) {

			generator.writeKey("number_of_fragments");
			generator.write(this.numberOfFragments);

		}
		if (this.order != null) {

			generator.writeKey("order");
			this.order.serialize(generator, mapper);
		}
		if (this.phraseLimit != null) {

			generator.writeKey("phrase_limit");
			generator.write(this.phraseLimit);

		}
		if (this.postTags != null) {

			generator.writeKey("post_tags");
			generator.writeStartArray();
			for (String item0 : this.postTags) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.preTags != null) {

			generator.writeKey("pre_tags");
			generator.writeStartArray();
			for (String item0 : this.preTags) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.requireFieldMatch != null) {

			generator.writeKey("require_field_match");
			generator.write(this.requireFieldMatch);

		}
		if (this.tagsSchema != null) {

			generator.writeKey("tags_schema");
			this.tagsSchema.serialize(generator, mapper);
		}
		if (this.type != null) {

			generator.writeKey("type");
			this.type.serialize(generator, mapper);
		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HighlightField}.
	 */
	public static class Builder implements ObjectBuilder<HighlightField> {
		@Nullable
		private String boundaryChars;

		@Nullable
		private Integer boundaryMaxScan;

		@Nullable
		private BoundaryScanner boundaryScanner;

		@Nullable
		private String boundaryScannerLocale;

		@Nullable
		private String field;

		@Nullable
		private Boolean forceSource;

		@Nullable
		private HighlighterFragmenter fragmenter;

		@Nullable
		private Integer fragmentOffset;

		@Nullable
		private Integer fragmentSize;

		@Nullable
		private Query highlightQuery;

		@Nullable
		private List<String> matchedFields;

		@Nullable
		private Integer maxFragmentLength;

		@Nullable
		private Integer noMatchSize;

		@Nullable
		private Integer numberOfFragments;

		@Nullable
		private HighlighterOrder order;

		@Nullable
		private Integer phraseLimit;

		@Nullable
		private List<String> postTags;

		@Nullable
		private List<String> preTags;

		@Nullable
		private Boolean requireFieldMatch;

		@Nullable
		private HighlighterTagsSchema tagsSchema;

		@Nullable
		private HighlighterType type;

		/**
		 * API name: {@code boundary_chars}
		 */
		public Builder boundaryChars(@Nullable String value) {
			this.boundaryChars = value;
			return this;
		}

		/**
		 * API name: {@code boundary_max_scan}
		 */
		public Builder boundaryMaxScan(@Nullable Integer value) {
			this.boundaryMaxScan = value;
			return this;
		}

		/**
		 * API name: {@code boundary_scanner}
		 */
		public Builder boundaryScanner(@Nullable BoundaryScanner value) {
			this.boundaryScanner = value;
			return this;
		}

		/**
		 * API name: {@code boundary_scanner_locale}
		 */
		public Builder boundaryScannerLocale(@Nullable String value) {
			this.boundaryScannerLocale = value;
			return this;
		}

		/**
		 * API name: {@code field}
		 */
		public Builder field(@Nullable String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code force_source}
		 */
		public Builder forceSource(@Nullable Boolean value) {
			this.forceSource = value;
			return this;
		}

		/**
		 * API name: {@code fragmenter}
		 */
		public Builder fragmenter(@Nullable HighlighterFragmenter value) {
			this.fragmenter = value;
			return this;
		}

		/**
		 * API name: {@code fragment_offset}
		 */
		public Builder fragmentOffset(@Nullable Integer value) {
			this.fragmentOffset = value;
			return this;
		}

		/**
		 * API name: {@code fragment_size}
		 */
		public Builder fragmentSize(@Nullable Integer value) {
			this.fragmentSize = value;
			return this;
		}

		/**
		 * API name: {@code highlight_query}
		 */
		public Builder highlightQuery(@Nullable Query value) {
			this.highlightQuery = value;
			return this;
		}

		/**
		 * API name: {@code highlight_query}
		 */
		public Builder highlightQuery(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.highlightQuery(fn.apply(new Query.Builder()).build());
		}

		/**
		 * API name: {@code matched_fields}
		 */
		public Builder matchedFields(@Nullable List<String> value) {
			this.matchedFields = value;
			return this;
		}

		/**
		 * API name: {@code matched_fields}
		 */
		public Builder matchedFields(String... value) {
			this.matchedFields = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #matchedFields(List)}, creating the list if needed. 4
		 */
		public Builder addMatchedFields(String value) {
			if (this.matchedFields == null) {
				this.matchedFields = new ArrayList<>();
			}
			this.matchedFields.add(value);
			return this;
		}

		/**
		 * API name: {@code max_fragment_length}
		 */
		public Builder maxFragmentLength(@Nullable Integer value) {
			this.maxFragmentLength = value;
			return this;
		}

		/**
		 * API name: {@code no_match_size}
		 */
		public Builder noMatchSize(@Nullable Integer value) {
			this.noMatchSize = value;
			return this;
		}

		/**
		 * API name: {@code number_of_fragments}
		 */
		public Builder numberOfFragments(@Nullable Integer value) {
			this.numberOfFragments = value;
			return this;
		}

		/**
		 * API name: {@code order}
		 */
		public Builder order(@Nullable HighlighterOrder value) {
			this.order = value;
			return this;
		}

		/**
		 * API name: {@code phrase_limit}
		 */
		public Builder phraseLimit(@Nullable Integer value) {
			this.phraseLimit = value;
			return this;
		}

		/**
		 * API name: {@code post_tags}
		 */
		public Builder postTags(@Nullable List<String> value) {
			this.postTags = value;
			return this;
		}

		/**
		 * API name: {@code post_tags}
		 */
		public Builder postTags(String... value) {
			this.postTags = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #postTags(List)}, creating the list if needed. 4
		 */
		public Builder addPostTags(String value) {
			if (this.postTags == null) {
				this.postTags = new ArrayList<>();
			}
			this.postTags.add(value);
			return this;
		}

		/**
		 * API name: {@code pre_tags}
		 */
		public Builder preTags(@Nullable List<String> value) {
			this.preTags = value;
			return this;
		}

		/**
		 * API name: {@code pre_tags}
		 */
		public Builder preTags(String... value) {
			this.preTags = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #preTags(List)}, creating the list if needed. 4
		 */
		public Builder addPreTags(String value) {
			if (this.preTags == null) {
				this.preTags = new ArrayList<>();
			}
			this.preTags.add(value);
			return this;
		}

		/**
		 * API name: {@code require_field_match}
		 */
		public Builder requireFieldMatch(@Nullable Boolean value) {
			this.requireFieldMatch = value;
			return this;
		}

		/**
		 * API name: {@code tags_schema}
		 */
		public Builder tagsSchema(@Nullable HighlighterTagsSchema value) {
			this.tagsSchema = value;
			return this;
		}

		/**
		 * API name: {@code type}
		 */
		public Builder type(@Nullable HighlighterType value) {
			this.type = value;
			return this;
		}

		/**
		 * Builds a {@link HighlightField}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HighlightField build() {

			return new HighlightField(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link HighlightField}
	 */
	public static final JsonpDeserializer<HighlightField> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			HighlightField::setupHighlightFieldDeserializer, Builder::build);

	protected static void setupHighlightFieldDeserializer(DelegatingDeserializer<HighlightField.Builder> op) {

		op.add(Builder::boundaryChars, JsonpDeserializer.stringDeserializer(), "boundary_chars");
		op.add(Builder::boundaryMaxScan, JsonpDeserializer.integerDeserializer(), "boundary_max_scan");
		op.add(Builder::boundaryScanner, BoundaryScanner._DESERIALIZER, "boundary_scanner");
		op.add(Builder::boundaryScannerLocale, JsonpDeserializer.stringDeserializer(), "boundary_scanner_locale");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::forceSource, JsonpDeserializer.booleanDeserializer(), "force_source");
		op.add(Builder::fragmenter, HighlighterFragmenter._DESERIALIZER, "fragmenter");
		op.add(Builder::fragmentOffset, JsonpDeserializer.integerDeserializer(), "fragment_offset");
		op.add(Builder::fragmentSize, JsonpDeserializer.integerDeserializer(), "fragment_size");
		op.add(Builder::highlightQuery, Query._DESERIALIZER, "highlight_query");
		op.add(Builder::matchedFields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"matched_fields");
		op.add(Builder::maxFragmentLength, JsonpDeserializer.integerDeserializer(), "max_fragment_length");
		op.add(Builder::noMatchSize, JsonpDeserializer.integerDeserializer(), "no_match_size");
		op.add(Builder::numberOfFragments, JsonpDeserializer.integerDeserializer(), "number_of_fragments");
		op.add(Builder::order, HighlighterOrder._DESERIALIZER, "order");
		op.add(Builder::phraseLimit, JsonpDeserializer.integerDeserializer(), "phrase_limit");
		op.add(Builder::postTags, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"post_tags");
		op.add(Builder::preTags, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"pre_tags");
		op.add(Builder::requireFieldMatch, JsonpDeserializer.booleanDeserializer(), "require_field_match");
		op.add(Builder::tagsSchema, HighlighterTagsSchema._DESERIALIZER, "tags_schema");
		op.add(Builder::type, HighlighterType._DESERIALIZER, "type");

	}

}