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

package org.opensearch.clients.elasticsearch._types;

import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.JsonpSerializable;
import org.opensearch.clients.json.ObjectDeserializer;
import org.opensearch.clients.util.ApiTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import org.opensearch.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.WriteResponseBase

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/_types/Base.ts#L37-L47">API
 *      specification</a>
 */

public abstract class WriteResponseBase implements JsonpSerializable {
	private final String id;

	private final String index;

	private final long primaryTerm;

	private final Result result;

	private final long seqNo;

	private final ShardStatistics shards;

	@Nullable
	private final String type;

	private final long version;

	@Nullable
	private final Boolean forcedRefresh;

	// ---------------------------------------------------------------------------------------------

	protected WriteResponseBase(AbstractBuilder<?> builder) {

		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
		this.primaryTerm = ApiTypeHelper.requireNonNull(builder.primaryTerm, this, "primaryTerm");
		this.result = ApiTypeHelper.requireNonNull(builder.result, this, "result");
		this.seqNo = ApiTypeHelper.requireNonNull(builder.seqNo, this, "seqNo");
		this.shards = ApiTypeHelper.requireNonNull(builder.shards, this, "shards");
		this.type = builder.type;
		this.version = ApiTypeHelper.requireNonNull(builder.version, this, "version");
		this.forcedRefresh = builder.forcedRefresh;

	}

	/**
	 * Required - API name: {@code _id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Required - API name: {@code _index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * Required - API name: {@code _primary_term}
	 */
	public final long primaryTerm() {
		return this.primaryTerm;
	}

	/**
	 * Required - API name: {@code result}
	 */
	public final Result result() {
		return this.result;
	}

	/**
	 * Required - API name: {@code _seq_no}
	 */
	public final long seqNo() {
		return this.seqNo;
	}

	/**
	 * Required - API name: {@code _shards}
	 */
	public final ShardStatistics shards() {
		return this.shards;
	}

	/**
	 * API name: {@code _type}
	 */
	@Nullable
	public final String type() {
		return this.type;
	}

	/**
	 * Required - API name: {@code _version}
	 */
	public final long version() {
		return this.version;
	}

	/**
	 * API name: {@code forced_refresh}
	 */
	@Nullable
	public final Boolean forcedRefresh() {
		return this.forcedRefresh;
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

		generator.writeKey("_id");
		generator.write(this.id);

		generator.writeKey("_index");
		generator.write(this.index);

		generator.writeKey("_primary_term");
		generator.write(this.primaryTerm);

		generator.writeKey("result");
		this.result.serialize(generator, mapper);
		generator.writeKey("_seq_no");
		generator.write(this.seqNo);

		generator.writeKey("_shards");
		this.shards.serialize(generator, mapper);

		if (this.type != null) {
			generator.writeKey("_type");
			generator.write(this.type);

		}
		generator.writeKey("_version");
		generator.write(this.version);

		if (this.forcedRefresh != null) {
			generator.writeKey("forced_refresh");
			generator.write(this.forcedRefresh);

		}

	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				ObjectBuilderBase {
		private String id;

		private String index;

		private Long primaryTerm;

		private Result result;

		private Long seqNo;

		private ShardStatistics shards;

		@Nullable
		private String type;

		private Long version;

		@Nullable
		private Boolean forcedRefresh;

		/**
		 * Required - API name: {@code _id}
		 */
		public final BuilderT id(String value) {
			this.id = value;
			return self();
		}

		/**
		 * Required - API name: {@code _index}
		 */
		public final BuilderT index(String value) {
			this.index = value;
			return self();
		}

		/**
		 * Required - API name: {@code _primary_term}
		 */
		public final BuilderT primaryTerm(long value) {
			this.primaryTerm = value;
			return self();
		}

		/**
		 * Required - API name: {@code result}
		 */
		public final BuilderT result(Result value) {
			this.result = value;
			return self();
		}

		/**
		 * Required - API name: {@code _seq_no}
		 */
		public final BuilderT seqNo(long value) {
			this.seqNo = value;
			return self();
		}

		/**
		 * Required - API name: {@code _shards}
		 */
		public final BuilderT shards(ShardStatistics value) {
			this.shards = value;
			return self();
		}

		/**
		 * Required - API name: {@code _shards}
		 */
		public final BuilderT shards(Function<ShardStatistics.Builder, ObjectBuilder<ShardStatistics>> fn) {
			return this.shards(fn.apply(new ShardStatistics.Builder()).build());
		}

		/**
		 * API name: {@code _type}
		 */
		public final BuilderT type(@Nullable String value) {
			this.type = value;
			return self();
		}

		/**
		 * Required - API name: {@code _version}
		 */
		public final BuilderT version(long value) {
			this.version = value;
			return self();
		}

		/**
		 * API name: {@code forced_refresh}
		 */
		public final BuilderT forcedRefresh(@Nullable Boolean value) {
			this.forcedRefresh = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupWriteResponseBaseDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(AbstractBuilder::index, JsonpDeserializer.stringDeserializer(), "_index");
		op.add(AbstractBuilder::primaryTerm, JsonpDeserializer.longDeserializer(), "_primary_term");
		op.add(AbstractBuilder::result, Result._DESERIALIZER, "result");
		op.add(AbstractBuilder::seqNo, JsonpDeserializer.longDeserializer(), "_seq_no");
		op.add(AbstractBuilder::shards, ShardStatistics._DESERIALIZER, "_shards");
		op.add(AbstractBuilder::type, JsonpDeserializer.stringDeserializer(), "_type");
		op.add(AbstractBuilder::version, JsonpDeserializer.longDeserializer(), "_version");
		op.add(AbstractBuilder::forcedRefresh, JsonpDeserializer.booleanDeserializer(), "forced_refresh");

	}

}