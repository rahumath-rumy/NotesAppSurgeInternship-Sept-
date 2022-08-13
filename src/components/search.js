import React from 'react';
import { MdSearch } from 'react-icons/md';

const Search = ({ handleSearchUser }) => {
	return (
		<div className='search'>
			<MdSearch className='search-icons' size='1.5em' />
			<input
				onChange={(event) =>
					handleSearchNote(event.target.value)
				}
				type='text'
				placeholder='Enter Student Name'
			/>
		</div>
	);
};

export default Search;